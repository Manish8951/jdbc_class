package com.xworkz.tv_app.Runner;

import com.xworkz.tv_app.TVDetails;
import com.xworkz.tv_app.dao.*;
import com.xworkz.tv_app.dao.TVChannelDAOImpl;
import com.xworkz.tv_app.dao.TvChannelDAO;
import com.xworkz.tv_app.entity.TVChannel;

public class TVRunner {
	
	public static void main(String[] args) {
		
		TVChannel tvChannel=new TVChannel();
		tvChannel.setChannel_id(4);
		tvChannel.setChannel_name("PixMovies");
		tvChannel.setLanguage("English");
		tvChannel.setCost(98563);
		tvChannel.set_free(true);
		
		
	      
		
		TvChannelDAO tvChannelDAO = new TVChannelDAOImpl();
		//tvChannelDAO.saveTVChannel(tvChannel);
		System.out.println("Channel Saved Sucessfully");
		
		//TVDetails tv= new TVDetails();
	//	tv.getDetails();
		
		System.out.println(tvChannelDAO.getChannelById(3));
		
	     //  tvChannelDAO.updateChannelPriceById(98563,3);
		
		tvChannelDAO.deleteTVChannel(3);
		
		
		
		
	}

	
}
