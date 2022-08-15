package com.learneracademy.Entityclasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learnersacademy.mapping.util.AHibernateUtil;
 import com.learneracademy.Entityclasses.Students;
 import com.learneracademy.Entityclasses.Classes;
 import com.learneracademy.Entityclasses.Subjects;
 import com.learneracademy.Entityclasses.Teachers;

public class InsertData {

	public static void main(String[] args) 
	{
	Transaction tx = null;

	try {
		SessionFactory sessionfactory = AHibernateUtil.getsessionFactory();
		Session session = sessionfactory.openSession();
		tx = session.beginTransaction();
		
	System.out.println("hi");
		
		//Creating List of Students
		Students stu1 = new Students(101, "Ram", "chennai");
		session.save(stu1);
		
		Students stu2 = new Students(102, "James", "Bangalore");
		session.save(stu2);
		
		Students stu3 = new Students(103, "Robert", "Hyderabad");
		session.save(stu3);
		
		Students stu4 = new Students(104, "John", "chennai");
		session.save(stu4);
		
		Students stu5 = new Students(105, "Richard", "Bangalore");
		session.save(stu5);
		
		Students stu6 = new Students(106, "Joseph", "Goa");
		session.save(stu6);
		
		Students stu7 = new Students(107, "Charles", "Hyderabad");
		session.save(stu7);
		
		Students stu8 = new Students(108, "Christopher", "Bangalore");
		session.save(stu8);
		
		Students stu9 = new Students(109, "Daniel", "chennai");
		session.save(stu9);
		
		Students stu10 = new Students(110, "Matthew", "Hyderabad");
		session.save(stu10);
		
		Students stu11 = new Students(111, "Anthony", "chennai");
		session.save(stu11);
		
		Students stu12 = new Students(112, "Mark", "Bangalore");
		session.save(stu12);
		
		Students stu13 = new Students(113, "Donald", "chennai");
		session.save(stu13);
		
		Students stu14 = new Students(114, "Steven", "Hyderabad");
		session.save(stu14);
		
		Students stu15 = new Students(115, "paul", "Bangalore");
		session.save(stu15);
		
		Students stu16 = new Students(116, "Abhishek", "chennai");
		session.save(stu16);
		
		Students stu17 = new Students(117, "Vikas", "Hyderabad");
		session.save(stu17);
		
		Students stu18 = new Students(118, "Prathap", "Bangalore");
		session.save(stu18);
		
		
		
//creating list of SUBJECTS		
		Subjects sub1 = new Subjects("En", "English", "Easy");
		Subjects sub2 = new Subjects("Ta", "Tamil", "Easy");
		Subjects sub3 = new Subjects("Ma", "Maths", "Hard");
		Subjects sub4 = new Subjects("Ph", "Physics", "Easy");
		Subjects sub5 = new Subjects("Ch", "Chemistry", "Hard");
		Subjects sub6 = new Subjects("Bio", "Biology", "Medium");
		
		session.save(sub1);
		session.save(sub2);
		session.save(sub3);
		session.save(sub4);
		session.save(sub5);
		session.save(sub6);
		
		
//creating list of classes
		
		Classes c1 = new Classes("Class_A", "1st_Floor", "Mon,Tue", "2Hrs", "9AM - 11AM");
		Classes c2 = new Classes("Class_B", "2nd_Floor", "Tue,Thur", "1Hr", "11AM - 12PM");
		Classes c3 = new Classes("Class_C", "3rd_Floor", "Wed,Thur", "3Hrs", "8AM - 11AM");
		Classes c4 = new Classes("Class_D", "4th_Floor", "Everyday", "1Hr", "4PM - 5PM");
		Classes c5 = new Classes("Class_E", "5th_Floor", "Fri", "3Hrs", "9AM - 12PM");
		Classes c6 = new Classes("Class_F", "6th_Floor", "Wed", "2Hrs", "1PM - 3PM");
		
		

		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.save(c6);
		
		
//creating list of Teachers
		Teachers t1 = new Teachers("Je", "Jenny", "New york");
		Teachers t2 = new Teachers("To", "Tory", "La");
		Teachers t3 = new Teachers("Jen", "Jenifer", "Vegas");
		Teachers t4 = new Teachers("Be", "Benitta", "Nigeria");
	//	Teachers t5 = new Teachers("Li", "Lisa", "London");
	//	Teachers t6 = new Teachers("Al", "Alisa", "Goa");
		
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		//session.save(t5);
		//session.save(t6);
		

		//Assigning Classes for Subjects

		c1.setSub_obj(sub1);
		c2.setSub_obj(sub2);
		c3.setSub_obj(sub3);
		c4.setSub_obj(sub4);
		c5.setSub_obj(sub5);
		c6.setSub_obj(sub6);


		//Assigning Teachers to the class

		c1.setTch_obj(t1);
		c2.setTch_obj(t2);
		c3.setTch_obj(t3);
		c4.setTch_obj(t4);
		c5.setTch_obj(t1);
		c6.setTch_obj(t2);




		//Assigning Students to the classes

		
		stu1.setCls_stu_obj(c1);
		stu2.setCls_stu_obj(c2);
		stu3.setCls_stu_obj(c3);
		stu4.setCls_stu_obj(c4);
		stu5.setCls_stu_obj(c5);
		stu6.setCls_stu_obj(c6);
		stu7.setCls_stu_obj(c1);
		stu8.setCls_stu_obj(c2);
		stu9.setCls_stu_obj(c3);
		stu10.setCls_stu_obj(c4);
		stu11.setCls_stu_obj(c5);
		stu12.setCls_stu_obj(c6);
		stu13.setCls_stu_obj(c1);
		stu14.setCls_stu_obj(c2);
		stu15.setCls_stu_obj(c3);
		stu16.setCls_stu_obj(c4);
		stu17.setCls_stu_obj(c5);
		stu18.setCls_stu_obj(c6);

		
		
		
		
//Commit the changes		
		tx.commit();
		session.close();
		
	System.out.println("sa");
		
		}
	catch(Exception e)
	{
		e.printStackTrace();
		if(tx!=null) {
			tx.rollback();
	}

	}
}
	
}
