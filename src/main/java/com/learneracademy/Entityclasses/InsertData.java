package com.learneracademy.Entityclasses;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learnersacademy.mapping.util.AHibernateUtil;
 import com.learneracademy.Entityclasses.*;

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
		Students stu2 = new Students(102, "James", "Bangalore");
		Students stu3 = new Students(103, "Robert", "Hyderabad");
		Students stu4 = new Students(104, "John", "chennai");
		Students stu5 = new Students(105, "Richard", "Bangalore");
		Students stu6 = new Students(106, "Joseph", "Goa");
		Students stu7 = new Students(107, "Charles", "Hyderabad");
		Students stu8 = new Students(108, "Christopher", "Bangalore");
		Students stu9 = new Students(109, "Daniel", "chennai");
		Students stu10 = new Students(110, "Matthew", "Hyderabad");
		Students stu11 = new Students(111, "Anthony", "chennai");
		Students stu12 = new Students(112, "Mark", "Bangalore");
		Students stu13 = new Students(113, "Donald", "chennai");
		Students stu14 = new Students(114, "Steven", "Hyderabad");
		Students stu15 = new Students(115, "paul", "Bangalore");
		Students stu16 = new Students(116, "Abhishek", "chennai");
		Students stu17 = new Students(117, "Vikas", "Hyderabad");
		Students stu18 = new Students(118, "Prathap", "Bangalore");
		
		
		session.save(stu1);
		session.save(stu2);
		session.save(stu3);
		session.save(stu4);
		session.save(stu5);
		session.save(stu6);
		session.save(stu7);
		session.save(stu8);
		session.save(stu9);
		session.save(stu10);
		session.save(stu11);
		session.save(stu12);
		session.save(stu13);
		session.save(stu14);
		session.save(stu15);
		session.save(stu16);
		session.save(stu17);
		session.save(stu18);
		
//creating list of students		
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
		Teachers t5 = new Teachers("Li", "Lisa", "London");
		Teachers t6 = new Teachers("Al", "Alisa", "Goa");
		
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);
		session.save(t5);
		session.save(t6);
		
//Commit the changes		
		tx.commit();
		session.close();
		
	System.out.println("sa");
		
		}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}
}
	
	
