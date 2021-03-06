package com.xworkz.hibernatedemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data          //to generate getter setter tostring hashcode
@Entity                    //to decleare we have restorent class as entity
@Table(name="restorent")     //if table name and class name are same dont use it
public class RestorentEntity {
	
	
	@Id                             //for primary key inside table
	@Column(name="id")                
	private int restorentId;
	@Column(name="contact_no")
	private long contactNo;
	private String name;
	private String type;
	@Column(name="rating")
	private double ratings;
	
	

}
