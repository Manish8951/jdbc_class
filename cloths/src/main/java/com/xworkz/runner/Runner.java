package com.xworkz.runner;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.google.protobuf.TextFormat.ParseException;
import com.xworkz.clothsapp.ClothesDAOImpl;
import com.xworkz.entity.Clothes;

public class Runner {
	
	public static void main(String[] args) {
		
		
			Clothes clothes = new Clothes();
			
			clothes.setId(4);
			clothes.setBrand("Levis");
			clothes.setPrice(225.00);
			ClothesDAOImpl daoImpl = new ClothesDAOImpl();
			daoImpl.insertClothes(clothes);
			System.out.println(clothes);
			System.out.println("Saved Sucessfully.....!");
			
			
			daoImpl.deleteClothesById(4);
			System.out.println("Deleted successfully..");
			
			daoImpl.getClothesById(1);

			
			
			
			
			
		
		
		
	}

}
