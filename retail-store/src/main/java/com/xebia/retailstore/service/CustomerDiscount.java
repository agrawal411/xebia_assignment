package com.xebia.retailstore.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.util.ConstantHelper;
import com.xebia.retailstore.util.Utility;

/*
 * This class implements BillCalculator interface and provide discount calculation of for user type Customer.
 */
public class CustomerDiscount implements BillCalculator{

	public double calculate(List<Item> list,User user) {
		double sumDiscountedItem=0;
		double sum=0;
		double discount=0;
		
		sum=list.stream().map(item -> item.getPrice()).collect(Collectors.summingDouble(Double :: doubleValue));
		
		if(user instanceof Customer) {
			if(Utility.checkRegistrationDuration(((Customer) user).getRegistrationDate(), ConstantHelper.NO_OF_YEARS_DISCOUNT_APPLICABLE)) {
				sumDiscountedItem=list.stream().filter(it -> !it.getType().equalsIgnoreCase("Grocery"))
										.map(item -> item.getPrice())
										.collect(Collectors.summingDouble(Double :: doubleValue));
				
				discount=sumDiscountedItem*ConstantHelper.TWO_YEARS_DISCOUNT/100;
				sum=sum-discount;
				}
		}		
		Double additionlaDiscount=Utility.calculateAdditionalDiscount(sum);
		return sum-additionlaDiscount;						
	}

}
