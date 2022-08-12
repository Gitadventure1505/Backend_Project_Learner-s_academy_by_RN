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


	
}

