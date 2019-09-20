package com.xebia.retailstore.bean;

import com.xebia.retailstore.util.UserType;

/*
 * Parent class for all the types of user and contains common attributes to all user types.
 */

public class User {
	
	private long id;
	private String name;
	private String mobileNo;
	private UserType type;
	 
	public User() {}
		
	public User(long id, String name, String mobileNo, UserType type) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	
	
	
	

}
