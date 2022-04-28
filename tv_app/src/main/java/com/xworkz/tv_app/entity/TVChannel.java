package com.xworkz.tv_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name="tv_channel")
public class TVChannel {
	
	@Id
	
	private int channel_id;
	private String channel_name;
	private String language;
	private double cost;
	private boolean is_free;
	
	
	

}
