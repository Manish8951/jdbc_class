package com.xworkz.tv_app.dao;

import com.xworkz.tv_app.entity.TVChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TVChannelDAOImpl implements TvChannelDAO {

	@Override
	public void saveTVChannel(TVChannel tvChannel) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction tx=null;
		
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

}
