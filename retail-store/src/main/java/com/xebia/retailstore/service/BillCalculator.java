package com.xebia.retailstore.service;

import java.util.List;

import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;

public interface BillCalculator {
	
	public double calculate(List<Item> list,User user);

}
