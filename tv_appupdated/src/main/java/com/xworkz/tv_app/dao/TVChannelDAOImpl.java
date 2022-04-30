package com.xworkz.tv_app.dao;

import com.xworkz.tv_app.entity.TVChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TVChannelDAOImpl implements TvChannelDAO {
	
	private EntityManagerFactory factory=Persistence.createEntityManagerFactory("tv");
       	EntityTransaction tx=null;
	@Override
	public void saveTVChannel(TVChannel tvChannel) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		
		
		try {
			factory=Persistence.createEntityManagerFactory("tv");
			entityManager=factory.createEntityManager();
			tx=entityManager.getTransaction();
			tx.begin();
			entityManager.persist(tvChannel);
			tx.commit();
			
		} catch (Exception e) {
		     tx.rollback();
		     e.printStackTrace();
		} finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		
		
	}

	@Override
	public TVChannel getChannelById(Integer channelId) {
		EntityManager entityManager=null;
		TVChannel tvChannel=null;
		
		try {
			EntityManager entityManager1=factory.createEntityManager();
			entityManager1.find(TVChannel.class, channelId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		return null;
	}

	@Override
	public void updateChannelPriceById(Double cost, Integer channelId) {
		 EntityManager entityManager=null;
		 EntityTransaction transaction=null;
		 TVChannel tvChannel=null;
		 
		
		 try {
			 entityManager=factory.createEntityManager();
			 tvChannel=entityManager.find(TVChannel.class, channelId);
			 if(tvChannel!=null) {
				 tx=entityManager.getTransaction();
				 tx.begin();
				 tvChannel.setCost(cost);
				 entityManager.merge(tvChannel);
				 tx.commit();	 
			 } else {
				 System.out.println("Channel Not Found");
			 }
			  
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		} finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
	}

	@Override
	public void deleteTVChannel(Integer channelId) {
		
		 EntityManager entityManager=null;
		 EntityTransaction transaction=null;
		 TVChannel tvChannel=null;
		 
		
		 try {
			 entityManager=factory.createEntityManager();
			 tvChannel=entityManager.find(TVChannel.class, channelId);
			 if(tvChannel!=null) {
				 tx=entityManager.getTransaction();
				 tx.begin();
				 entityManager.remove(tvChannel);
				 
				 tx.commit();	 
			 } else {
				 System.out.println("Channel Not Found");
			 }
			  
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		} finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
	}

		
		
	}
	
	
	
	


