package com.xebia.retailstore.service;

import java.util.List;
import com.xebia.retailstore.bean.Item;
import com.xebia.retailstore.bean.User;

/*
 * Parent Interface to provide calculate method for all the type of users. 
 * All the type of discount calculation classes implement this interface.
 */

public interface BillCalculator {
	
	public double calculate(List<Item> list,User user);

}
