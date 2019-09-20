package com.xebia.retailstore.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Utility {
	
	public static boolean checkRegistrationDuration(Date date, int years) {
		
		/*
		 * LocalDate ld=LocalDate.now();
		 * 
		 * Date
		 * currentDate=Date.from(ld.atStartOfDay().atZone(ZoneId.systemDefault()).to);
		 */
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

	public static double calculateAdditionalDiscount(double sum) {
		
		double discount=0;
		discount=(Math.floor(sum/ConstantHelper.DISCOUNT_PER_VALUE))*ConstantHelper.PER_100_DISCOUNT;
		
		return discount;
	}
}
