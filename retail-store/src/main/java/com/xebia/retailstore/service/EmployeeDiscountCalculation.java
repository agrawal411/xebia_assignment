package com.xebia.retailstore.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.util.ConstantHelper;

public class EmployeeDiscountCalculation implements BillCalculator{

	public double calculate(List<Item> list) {
		double sumDiscountedItem=0;
		double sum=0;
		double discount=0;
		
		sum=list.stream().map(item -> item.getPrice()).collect(Collectors.summingDouble(Double :: doubleValue));
		
		sumDiscountedItem=list.stream().filter(item -> !item.getType().equalsIgnoreCase("Grocery"))
							.map(item -> item.getPrice()).
							collect(Collectors.summingDouble(Double :: doubleValue));
		
		discount=sumDiscountedItem*(ConstantHelper.EMPLOYEE_DISCOUNT)/100;
		sum=sum-discount;
		return sum;
	
	}
	
	

}
