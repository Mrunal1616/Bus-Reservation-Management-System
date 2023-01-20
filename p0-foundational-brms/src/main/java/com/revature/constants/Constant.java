package com.revature.constants;


public class Constant {
	

	public static final String SELECT_ALL_QUERY="SELECT `LOGIN_ID`,`PASSWORD`,`USERNAME`,`email`,`phone_no`,`date_of_birth`,`age`,`address`,`physical_disability`,`identity_proof` FROM `brms`.`registration` ";
	public static final String SELECT_SPECIFIC_QUERY="SELECT `LOGIN_ID`,`PASSWORD`,`USERNAME`,`email`,`phone_no`,`date_of_birth`,`age`,`address`,`physical_disability`,`identity_proof` FROM `brms`.`registration` WHERE `LOGIN_ID`=? ";
	public static final String INSERT_QUERY="INSERT INTO `brms`.`registration` (`LOGIN_ID`,`PASSWORD`,`USERNAME`,`email`,`phone_no`,`date_of_birth`,`age`) VALUES (?,?,?,?,?,?,?) ";
	public static final String UPDATE_QUERY="UPDATE `brms`.`registration` SET `PASSWORD`=?,`USERNAME`=?,`email`=?,`phone_no`=?,`date_of_birth`=?,`age`=?,`address`=?,`physical_disability`=?,`identity_proof`=? WHERE `LOGIN_ID`=? ";
	public static final String DELETE_QUERY="DELETE FROM `brms`.`registration` WHERE `LOGIN_ID`=? ";
	public static final String SELECT_QUERY = "SELECT `LOGIN_ID`,`PASSWORD` FROM `brms`.`registration` WHERE `LOGIN_ID`=? ";
	public static final String WELCOME_MESSAGE = "==================Welcome to Bus Reservation=============) ";
	public static final String SIGN_IN = "1.Sign In";
	public static final String SIGN_UP = "2.Sign Up";
	public static final String EXIT = "3.Exit";
	public static final String exitMessage = "==========Thank You do visit again==========";
	private Constant() {}

}
