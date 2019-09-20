package com.xebia.retailstore.util;

import java.util.Date;

public class Utility {
	
	
	/*
	 * Function to check whether customer 2 years old or not. 
	 */
	public static boolean checkRegistrationDuration(Date date, int years) {
		
		if(date == null) {
			return false;
		}
		boolean check=false;
		Date currentDate=new Date();
		
		double days=(currentDate.getTime()-date.getTime())/(1000*60*60*24);
		double discountDaysRequired=years*2;
		
		if(days>=discountDaysRequired) {
			check=true;
		}
		return check;
	}

	/*
	 * Function to calculate discount applicable to all users -  5$ per 100$ bill
	 */
	public static double calculateAdditionalDiscount(double sum) {
		
		double discount=0;
		discount=(Math.floor(sum/ConstantHelper.DISCOUNT_PER_VALUE))*ConstantHelper.PER_100_DISCOUNT;
		
		return discount;
	}
}
