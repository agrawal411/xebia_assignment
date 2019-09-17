package com.xebia.retailstore.service;

import java.util.List;

import com.xebia.retailstore.bean.Item;

public interface BillCalculator {
	
	public double calculate(List<Item> list);

}
