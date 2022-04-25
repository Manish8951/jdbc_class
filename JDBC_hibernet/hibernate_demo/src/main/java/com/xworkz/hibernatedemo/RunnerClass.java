package com.xworkz.hibernatedemo;

import com.xworkz.hibernatedemo.entity.RestorentEntity;

public class RunnerClass {
	
	public static void main (String []ar) {
		
		RestorentEntity restorententity = new RestorentEntity();      
		restorententity.setContactNo(1236545l);
		restorententity.setName("Andra Restorent");
		restorententity.setRatings(4.5);
		restorententity.setRestorentId(2);
		restorententity.setType("Non Veg");
		
		RestorentDAO restorentDAO = new RestorentDAO();
		restorentDAO.saveRestorent(restorententity);
		System.out.println("saved sucessfully");
		
		
		
	}

}
