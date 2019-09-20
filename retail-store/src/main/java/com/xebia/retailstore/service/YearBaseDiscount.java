package com.xebia.retailstore.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.util.ConstantHelper;
import com.xebia.retailstore.util.Utility;

public class YearBaseDiscount implements BillCalculator{

	public double calculate(List<Item> list,User user) {
		double sumDiscountedItem=0;
		double sum=0;
		double discount=0;
		
		sum=list.stream().map(item -> item.getPrice()).collect(Collectors.summingDouble(Double :: doubleValue));
		
		if(user instanceof Customer) {
			//System.out.println(user.getType());
			if(Utility.checkRegistrationDuration(((Customer) user).getRegistrationDate(), ConstantHelper.NO_OF_YEARS_DISCOUNT_APPLICABLE)) {
				sumDiscountedItem=list.stream().filter(it -> !it.getType().equalsIgnoreCase("Grocery"))
										.map(item -> item.getPrice())
										.collect(Collectors.summingDouble(Double :: doubleValue));
				
				discount=sumDiscountedItem*ConstantHelper.TWO_YEARS_DISCOUNT/100;
				sum=sum-discount;
				//System.out.println("2="+user.getType());
				}
		}
		//Calculate additional discount
		
		Double additionlaDiscount=Utility.calculateAdditionalDiscount(sum);
		return sum-additionlaDiscount;						
	}

}
