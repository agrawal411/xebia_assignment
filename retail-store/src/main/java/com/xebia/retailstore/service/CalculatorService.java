package com.xebia.retailstore.service;


import com.xebia.retailstore.bean.Customer;
import com.xebia.retailstore.bean.User;
import com.xebia.retailstore.util.ConstantHelper;
import com.xebia.retailstore.util.UserType;
import com.xebia.retailstore.util.Utility;

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
			
			//if(Utility.checkRegistrationDuration(((Customer) user).getRegistrationDate(),ConstantHelper.NO_OF_YEARS_DISCOUNT_APPLICABLE))
					calc=new YearBaseDiscount();
		}
		/*
		 * else { calc=new DiscountPerHundred(); }
		 */
				
		return calc;
	}

}
