package com.xworkz.hibernatedemo.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestorentJpaDao {
	
	public void saveRestorentJPA(RestorentEntity entity) {
		
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "manish" );
    
    EntityManager entitymanager = emfactory.createEntityManager( );
    entitymanager.getTransaction().begin( );

       entitymanager.persist( entity );
    entitymanager.getTransaction( ).commit( );

    entitymanager.close( );
    emfactory.close( );
	}

}
