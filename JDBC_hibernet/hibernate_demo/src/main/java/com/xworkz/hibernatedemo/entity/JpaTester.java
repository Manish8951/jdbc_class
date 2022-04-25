package com.xworkz.hibernatedemo.entity;

public class JpaTester {
	
	public static void main(String[] args) {
		
		RestorentEntity entity = new RestorentEntity();
		entity.setContactNo(125478);
		entity.setType("non veg");
		entity.setName("nani");
		entity.setRestorentId(3);
		entity.setRatings(5);
		
		RestorentJpaDao jpaDao=new RestorentJpaDao();
		jpaDao.saveRestorentJPA(entity);
		System.out.println("saved sucessfully....!");
	}

}
