package com.xebia.retailstore.service;

import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.util.UserType;

/*
 * This class work as a factory class for all the implementations of BillCalculatior.
 * It returns object of discount calculator class on the basis of User type.
 */
public class CalculatorService {
	
	private BillCalculator calc;
	
	public BillCalculator getDiscountApplicable(User user) {
		
		if(user.getType().getValue().equalsIgnoreCase(UserType.EMPLOYEE.getValue())) {
			calc=new EmployeeDiscountCalculation();
		}
		else if(user.getType().getValue().equalsIgnoreCase(UserType.AFFILIATED_USER.getValue())) {
			calc=new AffiliatedDiscountCalculation();
		}
		else{
			calc=new CustomerDiscount();
		}
			
		return calc;
	}

}
