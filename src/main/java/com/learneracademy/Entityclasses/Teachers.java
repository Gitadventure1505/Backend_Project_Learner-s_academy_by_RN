package com.learneracademy.Entityclasses;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Teachers")
public class Teachers 
{

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Teacher_Id")
	private String T_id;
	
	@Column(name = "T_Name")
	private String T_name;
	
	
	@Column(name = "Teacher_location")
	private String T_loc;
	

	@OneToMany(mappedBy = "tch_obj")
	List <Classes> lst_cls_obj;
	
	
	
	
	
	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Teachers(String t_id, String t_name, String t_loc) {
		super();
		T_id = t_id;
		T_name = t_name;
		T_loc = t_loc;
	}


	
	
	
}