package com.xworkz.clothsapp;

import java.sql.Date;

import com.xworkz.entity.Clothes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ClothesDAOImpl implements ClothsDAO {
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("clothes");
	EntityManager manager=null;
	EntityTransaction tx=null;
	Clothes clothes=null;
	Date date;
	
	

	
		public void insertClothes(Clothes cloth) {
			try {
				manager = factory.createEntityManager();
				tx = manager.getTransaction();
				tx.begin();
				manager.persist(cloth);
				tx.commit();
			} catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
			} finally {
				if (manager != null) {
					manager.close();
				}
			}

		}
		
	

	public Clothes getClothesById(Integer Id) {
		
		manager = factory.createEntityManager();
		clothes = manager.find(Clothes.class, Id);
		if (clothes != null) {
			System.out.println(clothes.toString());
		} else {
			System.out.println("Record Not Found");
		}

		return clothes;
		
		
	}
	
public void deleteClothesById(Integer Id) {
		
		try {
			manager=factory.createEntityManager();
			clothes=manager.find(Clothes.class, Id);
			if (clothes!=null) {
				tx=manager.getTransaction();
				tx.begin();
				clothes.setDate(date);
				manager.merge(clothes);
				tx.commit();
			}else {
				System.out.println("Record Not Found..");
			}
			}catch (Exception e) {
				tx.rollback();
				e.printStackTrace();
			}finally {
				if (manager!=null) {
					manager.close();
				}
			}
		}

		

	public void updateDateById(Date date, Integer Id) {
		
		
		try {
			manager=factory.createEntityManager();
			clothes = manager.find(Clothes.class, Id);
			if (clothes!=null) {
				tx=manager.getTransaction();
				tx.begin();
				manager.remove(clothes);
				tx.commit();
			} else {
				System.out.println("Records Not Found....");

			}
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			if (manager!=null) {
				manager.close();
			}
		}
		
		
	}
		
	}


