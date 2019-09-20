package com.xebia.retailstore.service;

import java.util.List;
import java.util.stream.Collectors;

import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.util.ConstantHelper;

public class DiscountPerHundred implements BillCalculator{

	public double calculate(List<Item> list,User user) {
		/*
		 * double sum=0; double discount;
		 * 
		 * sum=list.stream() .map(item -> item.getPrice()).
		 * collect(Collectors.summingDouble(Double :: doubleValue));
		 * 
		 * discount=Math.floor(sum/100);
		 * sum=sum-(discount*ConstantHelper.PER_100_DISCOUNT); return sum;
		 */
		return 0;
	}

}
