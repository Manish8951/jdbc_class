package com.xworkz.tv_app.dao;

import com.xworkz.tv_app.entity.TVChannel;

public interface TvChannelDAO {
	
	public void saveTVChannel(TVChannel tvChannel);
	
	public TVChannel getChannelById(Integer channelId);
	
	public void updateChannelPriceById(Double cost, Integer channelId);
	
	public void deleteTVChannel(Integer channelId);

	
	

}
