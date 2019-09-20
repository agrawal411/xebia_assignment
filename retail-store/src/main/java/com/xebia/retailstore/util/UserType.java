package com.xebia.retailstore.util;

public enum UserType {
	
	EMPLOYEE("Employee"),AFFILIATED_USER("Affiliated_User"),CUSTOMER("Customer");
	
	UserType(String value) {
		this.value=value;
	}
	
	private final String value;

	public String getValue() {
		return value;
	}
	
	
	

}
