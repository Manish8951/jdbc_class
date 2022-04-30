package com.xworkz.tv_app;
import com.xworkz.tv_app.entity.TVChannel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TVDetails {
	
		
		public void getDetails() {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("tv");
			EntityManager entityManager=factory.createEntityManager();
			TVChannel tvchannel=entityManager.find(TVChannel.class, 3);
			System.out.println(tvchannel.toString());
		}


}
