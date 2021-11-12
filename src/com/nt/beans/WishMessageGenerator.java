package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
      
	
	//0-param-Constructor
	public WishMessageGenerator() {
	    System.out.println("WishMessageGenerator::0-param constructor");
	}


	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}
	
	public String generateWishMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateWishMessage()");
		
		int hour=date.getHours();
		
		if(hour<12)
			return "GM::"+user;
		
		else  if(hour<16)
		    return "GA::"+user;
		
		else if(hour<20)
			return "GE::"+user;
		
		else
			return "GN::"+user;
		
	}
	
	
	
	
	

}
