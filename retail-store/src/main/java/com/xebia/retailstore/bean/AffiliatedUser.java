package com.xebia.retailstore.bean;

import java.util.Date;
import com.xebia.retailstore.util.UserType;

/*
 * Child class to @User. Represent user type Affiliated user.
 */

public class AffiliatedUser extends User{
	
	private long userId;
	private String firmAffiliated;
	private Date joiningDate;
	
	public AffiliatedUser() {
		super();
	}
			
	public AffiliatedUser(long userId,String name,String mobileNo, String firmAffiliated, Date joiningDate) {
		super(userId,name,mobileNo,UserType.AFFILIATED_USER);
		this.userId = userId;
		this.firmAffiliated = firmAffiliated;
		this.joiningDate = joiningDate;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirmAffiliated() {
		return firmAffiliated;
	}
	public void setFirmAffiliated(String firmAffiliated) {
		this.firmAffiliated = firmAffiliated;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}			
}
