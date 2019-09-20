package com.xebia.retailstore.bean;

import java.util.Date;
import com.xebia.retailstore.util.UserType;

/*
 * Child class to User. Represent user type Employee.  
 */

public class Employee extends User{

	private long userId;
	private String category;
	private Date joiningDate;
	
	public Employee() {
		super();
	}
	
	public Employee(long userId,String name,String mobileNo,String category, Date joiningDate) {
		super(userId,name,mobileNo,UserType.EMPLOYEE);
		this.category = category;
		this.joiningDate = joiningDate;
		this.userId=userId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
		
}
