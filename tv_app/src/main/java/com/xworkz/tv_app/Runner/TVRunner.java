package com.xworkz.tv_app.Runner;

import com.xworkz.tv_app.TVDetails;
import com.xworkz.tv_app.dao.TVChannelDAOImpl;
import com.xworkz.tv_app.dao.TvChannelDAO;
import com.xworkz.tv_app.entity.TVChannel;

public class TVRunner {
	
	public static void main(String[] args) {
		
		TVChannel tvChannel=new TVChannel();
		tvChannel.setChannel_id(3);
		tvChannel.setChannel_name("StarMovies");
		tvChannel.setLanguage("English");
		tvChannel.setCost(36542);
		tvChannel.set_free(true);
		
		TvChannelDAO tvChannelDAO = new TVChannelDAOImpl();
		//tvChannelDAO.saveTVChannel(tvChannel);
		System.out.println("Channel Saved Sucessfully");
		
		TVDetails tv= new TVDetails();
		tv.getDetails();
		
		
		
		
	}

	
}
