package com.xebia.retailstore.service;

import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.util.Utility;

public class CalculatorService {
	
	private BillCalculator calc;
	
	public BillCalculator getDiscountApplicable(Customer customer) {
		
		if(customer.isEmployee()) {
			calc=new EmployeeDiscountCalculation();
		}
		else if(customer.isAffiliated()) {
			calc=new AffiliatedDiscountCalculation();
		}
		else if(customer.getRegistrationDate() != null) {
			
			if(Utility.checkRegistrationDuration(customer.getRegistrationDate(), 2)) {
				calc=new YearBaseDiscount();
			}
		}
		else {
			calc=new DiscountPerHundred();
		}
		
		return calc;
	}

}
