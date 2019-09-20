package com.xebia.retailstore.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.util.ConstantHelper;
import com.xebia.retailstore.util.Utility;

public class EmployeeDiscountCalculation implements BillCalculator{

	public double calculate(List<Item> list,User user) {
		double sumDiscountedItem=0;
		double sum=0;
		double discount=0;
		
		sum=list.stream().map(item -> item.getPrice()).collect(Collectors.summingDouble(Double :: doubleValue));
		
		sumDiscountedItem=list.stream().filter(item -> !item.getType().equalsIgnoreCase("Grocery"))
							.map(item -> item.getPrice()).
							collect(Collectors.summingDouble(Double :: doubleValue));
		
		discount=sumDiscountedItem*(ConstantHelper.EMPLOYEE_DISCOUNT)/100;
		sum=sum-discount;
		
		//Calculate additional discount
		
		Double additionlaDiscount=Utility.calculateAdditionalDiscount(sum);
		
		return sum-additionlaDiscount;
	
	}
	
	

}
