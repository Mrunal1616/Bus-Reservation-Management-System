package com.revature.model;

public class User {

	private String userLogin;
	private String userPass;
	private String role;
	private String username;
	private String email;
	private String phoneNo;
	private String dateOfBirth;
    private int age;
    private String address;
    private String physicalDisability;
    private String identityProof;

	public User(String userLogin, String userPass, String role) {
		super();
		this.userLogin = userLogin;
		this.userPass = userPass;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public User(String userLogin, String userPass, String username, String email, String phoneNo, String dateOfBirth,
			int age, String address, String physicalDisability, String identityProof) {
		super();
		this.userLogin = userLogin;
		this.userPass = userPass;
		this.username = username;
		this.email = email;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.address = address;
		this.physicalDisability = physicalDisability;
		this.identityProof = identityProof;
	}

	public User(String userLogin, String userPass, String role, String username, String email, String phoneNo,
			String dateOfBirth, int age, String address, String physicalDisability, String identityProof) {
		super();
		this.userLogin = userLogin;
		this.userPass = userPass;
		this.role = role;
		this.username = username;
		this.email = email;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.address = address;
		this.physicalDisability = physicalDisability;
		this.identityProof = identityProof;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "User [userLogin=" + userLogin + ", userPass=" + userPass + ", role=" + role + ", username=" + username
				+ ", email=" + email + ", phoneNo=" + phoneNo + ", dateOfBirth=" + dateOfBirth + ", age=" + age
				+ ", address=" + address + ", physicalDisability=" + physicalDisability + ", identityProof="
				+ identityProof + "]";
	}

	
}
