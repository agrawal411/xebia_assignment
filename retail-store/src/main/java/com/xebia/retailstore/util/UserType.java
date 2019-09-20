package com.xebia.retailstore.util;

/*
 * To restrict user type.
 * New user can be added here and new entity class can be created for that user.
 */
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
