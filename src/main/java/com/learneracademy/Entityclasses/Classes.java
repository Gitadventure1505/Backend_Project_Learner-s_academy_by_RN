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
	@JoinColumn(name = "Subject_Id")
	Subjects sub_obj;
	
	
	@OneToMany(mappedBy = "cls_stu_obj")
	List <Students> stu_lis_obj;
	
	
	@ManyToOne
	@JoinColumn(name = "Teacher_Id", referencedColumnName = "Teacher_Id")
	Teachers tch_obj;
	
	


	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Classes(String Class_Name, String c_loc, String class_occurence, String duration, String timings) {
		super();
		this.Class_Name = Class_Name;
		C_loc = c_loc;
		this.class_occurence = class_occurence;
		Duration = duration;
		Timings = timings;
	}




	public String getClass_Name() {
		return Class_Name;
	}




	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}




	public String getC_loc() {
		return C_loc;
	}




	public void setC_loc(String c_loc) {
		C_loc = c_loc;
	}




	public String getClass_occurence() {
		return class_occurence;
	}




	public void setClass_occurence(String class_occurence) {
		this.class_occurence = class_occurence;
	}




	public String getDuration() {
		return Duration;
	}




	public void setDuration(String duration) {
		Duration = duration;
	}




	public String getTimings() {
		return Timings;
	}




	public void setTimings(String timings) {
		Timings = timings;
	}




	public Subjects getSub_obj() {
		return sub_obj;
	}




	public void setSub_obj(Subjects sub_obj) {
		this.sub_obj = sub_obj;
	}




	public List<Students> getStu_lis_obj() {
		return stu_lis_obj;
	}




	public void setStu_lis_obj(List<Students> stu_lis_obj) {
		this.stu_lis_obj = stu_lis_obj;
	}




	public Teachers getTch_obj() {
		return tch_obj;
	}




	public void setTch_obj(Teachers tch_obj) {
		this.tch_obj = tch_obj;
	}
	
	
	
	







	
}
