package com.xebia.retailstore.bean;

import java.util.Date;

import com.xebia.retailstore.util.UserType;

/*
 * Class to register to customer to the system with mobile number.
 */
public class Customer extends User{
	
	private long userId;
	private Date registrationDate;
	private String customerCategory;
	
	public Customer() {
		super();
	}
	

	public Customer(long userId,String name,String mobileNo, Date registrationDate, String customerCategory) {
		super(userId,name,mobileNo,UserType.CUSTOMER);
		this.userId = userId;
		this.registrationDate = registrationDate;
		this.customerCategory = customerCategory;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	
	

}
