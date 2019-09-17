package com.xebia.retailstore.bean;

import java.util.Date;

/*
 * Class to register to customer to the system with mobile number.
 */
public class Customer {
	
	private String name;
	private String mobileNo;
	private Date registrationDate;
	private boolean isEmployee;
	private boolean isAffiliated;
	
	public Customer() {}
	
	public Customer(String name, String mobileNo, Date registrationDate, boolean isEmployee, boolean isAffiliated) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.registrationDate = registrationDate;
		this.isEmployee = isEmployee;
		this.isAffiliated = isAffiliated;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public boolean isEmployee() {
		return isEmployee;
	}
	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}
	public boolean isAffiliated() {
		return isAffiliated;
	}
	public void setAffiliated(boolean isAffiliated) {
		this.isAffiliated = isAffiliated;
	}
	
	

}
