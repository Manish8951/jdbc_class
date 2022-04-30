package com.xworkz.clothsapp;

import java.sql.Date;

import com.xworkz.entity.Clothes;

public interface ClothsDAO {
	
	public void insertClothes(Clothes cloth); 
	
	//public Clothes getClothesById(Integer Id);
	
	//public void deleteClothesById(Integer Id);
	
	public void updateDateById(Date date ,Integer Id);
	
	

}
