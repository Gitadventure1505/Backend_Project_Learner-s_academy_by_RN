package com.learneracademy.Entityclasses;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Class")
public class Classes 
{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Class_Name")
	private String Class_Name;
	
	
	@Column(name = "Class_location")
	private String C_loc;
	
	
	@Column(name = "Class_occurence")
	private String class_occurence;
	
	
	@Column(name = "Duration")
	private String Duration;
	
	
	@Column(name = "Timings")
	private String Timings;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Subject_Name")
	Subjects sub_obj;
	
	
	@OneToMany(mappedBy = "cls_stu_obj")
	List <Students> stu_lis_obj;
	
	
	@ManyToOne
	@JoinColumn(name = "Teacher_Id", referencedColumnName = "Teacher_Id")
	Teachers tch_obj;
	
	


	public Classes(String Class_Name, String c_loc, String class_occurence, String duration, String timings) {
		super();
		this.Class_Name = Class_Name;
		C_loc = c_loc;
		this.class_occurence = class_occurence;
		Duration = duration;
		Timings = timings;
	}
	







	
}
