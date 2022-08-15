package com.learneracademy.Entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Students")
public class Students 
{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Student_Id")
	private int S_id;
	
	@Column(name = "Student_Name")
	private String S_name;
	
	
	@Column(name = "Student_location")
	private String S_loc;
	
	
	@ManyToOne

	@JoinColumn(name = "Class", referencedColumnName = "Class_Name")
	Classes cls_stu_obj;
	
	

	public Students(int s_id, String s_name, String s_loc) {
		super();
		S_id = s_id;
		S_name = s_name;
		S_loc = s_loc;
	}
	



	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}





	public int getS_id() {
		return S_id;
	}



	public void setS_id(int s_id) {
		S_id = s_id;
	}



	public String getS_name() {
		return S_name;
	}



	public void setS_name(String s_name) {
		S_name = s_name;
	}



	public String getS_loc() {
		return S_loc;
	}



	public void setS_loc(String s_loc) {
		S_loc = s_loc;
	}



	public Classes getCls_stu_obj() {
		return cls_stu_obj;
	}



	public void setCls_stu_obj(Classes cls_stu_obj) {
		this.cls_stu_obj = cls_stu_obj;
	}
	
	


	
}

