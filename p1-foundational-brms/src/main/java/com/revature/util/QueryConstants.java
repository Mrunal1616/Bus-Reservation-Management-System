package com.revature.util;

public class QueryConstants {
	public static final String INSERT_USER = "INSERT INTO `brms`.`registration` (login_id,password,role) VALUES(?,?,?)";
	public static final String UPDATE_USER = "UPDATE `brms`.`registration` SET LOGIN_ID=?,PASSWORD=?,ROLE=?, USERNAME=?, EMAIL=?, PHONE_NO=?, DATE_OF_BIRTH=?, AGE=?, ADDRESS=?, PHYSICAL_DISABILITY=?, IDENTITY_PROOF=? WHERE  LOGIN_ID=?";
	public static final String DELETE_USER= "DELETE FROM `brms`.`registration` WHERE LOGIN_ID=?";
	public static final String SELECT_USER = "SELECT * FROM `brms`.`registration` WHERE LOGIN_ID=? AND PASSWORD=?";
	public static final String SELECT_USER_BY_ID = "SELECT * FROM `brms`.`registration` WHERE LOGIN_ID=?";
	public static final String SELECT_ALL_USER = "SELECT * FROM `brms`.`registration` ORDER BY ROLE";
	public static final String SELECT_USERS_BY_ID_PATTERN = "SELECT * FROM `brms`.`registration` WHERE LOGIN_ID LIKE ?";

}

