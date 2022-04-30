package com.xworkz.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table (name = "clothes_det")
public class Clothes {
	
	@Id
	private int id;
	private String brand;
	private double price;
	
	@Column(name="mfgdate")
	private Date date;
	

}
