package com.revature.model;

import com.revature.util.DateUtil;

public class User {
	
	DateUtil dateutil = new DateUtil();
	private String loginId;
	private String password;
	private String username;
	private String email;
	private String phoneNo;
	private String address;
	private String dateOfBirth;
	private String physicalDisability;
	private String identityProof;
	private int age;
	
	public User() {
		
	}
	public User(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}
	public User(String loginId, String password, String username, String email, String phoneNo) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.username = username;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	public User(String loginId, String password, String username, String email, String phoneNo, String address,
			String dateOfBirth, String physicalDisability, String identityProof, int age) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.username = username;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.physicalDisability = physicalDisability;
		this.identityProof = identityProof;
		this.age = age;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhysicalDisability() {
		return physicalDisability;
	}
	public void setPhysicalDisability(String physicalDisability) {
		this.physicalDisability = physicalDisability;
	}
	public String getIdentityProof() {
		return identityProof;
	}
	public void setIdentityProof(String identityProof) {
		this.identityProof = identityProof;
	}
	public int getAge() {
		return  DateUtil.ageCalculator(dateOfBirth);
	}
	public void setAge() {
		age = DateUtil.ageCalculator(dateOfBirth);
	
	}
	@Override
	public String toString() {
		return "\n"+"=========User Details==========\n"
				+ "loginId=" + loginId +"\n"+ "password=" + password +"\n"+ "username=" + username + "\n"+"email="
				+ email + "\n"+"phoneNo=" + phoneNo + "\n"+ "address=" + address + "\n" + "birthDate=" + dateOfBirth
				+ "\n" +"physicalDisability=" + physicalDisability + "\n"+"identityProof=" + identityProof + "\n" +"age=" + age;
	}
	
	
	
	

	
}
