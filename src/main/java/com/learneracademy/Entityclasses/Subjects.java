package com.learneracademy.Entityclasses;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


	@Entity
	@Table(name = "Subjects")
	public class Subjects 
	{

		@Id
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "Subject_Id")
		private String Sub_id;
		
		@Column(name = "Subject_Name")
		private String Sub_name;
		
		
		@Column(name = "Subject_Difficulty")
		private String Diff;
		
		
		@OneToOne(mappedBy = "sub_obj")
		Classes cls_obj;

		public Subjects(String sub_id, String sub_name, String diff) 
		{
			super();
			Sub_id = sub_id;
			Sub_name = sub_name;
			Diff = diff;
		}
		
		

				
	}
