package com.xworkz.hibernatedemo;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernatedemo.entity.RestorentEntity;

public class RestorentDAO {
	
       public void saveRestorent(RestorentEntity entity) {
    	   
    	   //only configuration is concrete ..rest all are interfaces
    	   Configuration cfg=new Configuration();
    	   cfg.configure();
    	   
    	   SessionFactory sessionFactory = cfg.buildSessionFactory();
    	   
    	   Session session = sessionFactory.openSession();
    	   
    	   Transaction tx = session.beginTransaction();
    	   
    	   session.persist(entity);
    	   
    	   tx.commit();
    	   
    	   
    	   
       }
	
	     
	
       
}
