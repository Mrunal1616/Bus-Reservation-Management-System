package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.dao.UserDao;
import com.revature.model.User;

public class UserDaoImpl implements UserDao{
	public static final Logger logger = Logger.getLogger(UserDaoImpl.class);
	private static Connection con = DatabaseConnection.getConnection();
	Scanner sc = new Scanner(System.in);
	public static int count;
	
	@Override
	public int addUserDetails() throws SQLException {
		User user = new User();
		
		logger.info("Enter login Id :");
		user.setLoginId((sc.nextLine()));
		logger.info("Enter password :");
		user.setPassword((sc.nextLine()));
		logger.info("Enter Username :");
		user.setUsername(sc.nextLine());
		logger.info("Enter email  :");
		user.setEmail(sc.nextLine());
		logger.info("Enter phone number :");
		user.setPhoneNo((sc.nextLine()));
		logger.info("Enter date of birth :");
		user.setDateOfBirth((sc.nextLine()));
		user.setAge();
		
		String insertQuery = Constant.INSERT_QUERY;
		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, user.getLoginId());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getUsername());
		ps.setString(4, user.getEmail());
		ps.setString(5, user.getPhoneNo());
		ps.setString(6, user.getDateOfBirth());
		ps.setInt(7, user.getAge());
		
		logger.debug("I want to inspect PreparedStatement object: "+ps);
		int n = ps.executeUpdate();
		ps.close();
		logger.info("Added User Details");
		return n;
	}
	
	@Override
	public int updateUserDetails(User user) throws SQLException {
		logger.info("Enter password to update :");
		String updatedPassword = sc.nextLine();
		logger.info("Enter Username :");
		String updatedUsername = sc.nextLine();
		logger.info("Enter email  :");
		String updatedEmail = sc.nextLine();
		logger.info("Enter phone number :");
		String updatedPhoneNo = sc.nextLine();
		logger.info("Enter date of birth :");
		String updatedDateOfBirth = sc.nextLine();
		user.setAge();
		logger.info("Enter address :");
		String updatedAddress = sc.nextLine();
		logger.info("Enter physical disability :");
		String updatedPhysicalDisability = sc.nextLine();
		logger.info("Enter identity proof :");
		String updatedIdentityProof = sc.nextLine();
		
		String updateQuery = Constant.UPDATE_QUERY;

		PreparedStatement ps = con.prepareStatement(updateQuery);
		ps.setString(1, updatedPassword);
		ps.setString(10, user.getLoginId());
		ps.setString(2, updatedUsername);
		ps.setString(3, updatedEmail);
		ps.setString(4, updatedPhoneNo);
		ps.setString(5, updatedDateOfBirth);
		ps.setInt(6, user.getAge());
		ps.setString(7, updatedAddress);
		ps.setString(8, updatedPhysicalDisability);
		ps.setString(9, updatedIdentityProof);
		int n = ps.executeUpdate();
		return n;
	}
	
	@Override
	public int delete(String loginId) throws SQLException {
		
		String deleQquery = Constant.DELETE_QUERY;
		PreparedStatement ps = con.prepareStatement(deleQquery);
		ps.setString(1, loginId);
		int n = ps.executeUpdate();
		return n;
	}
	@Override
	public User getUser(String loginId) throws SQLException {
		
		String selectSpecificQuery = Constant.SELECT_SPECIFIC_QUERY;
		PreparedStatement ps = con.prepareStatement(selectSpecificQuery);
		ps.setString(1, loginId);
		User user = new User();
		ResultSet rs = ps.executeQuery();
		boolean found = false;
		count=0;
		while (rs.next()) {
			user.setLoginId(rs.getString("LOGIN_ID"));
			user.setPassword(rs.getString("PASSWORD"));
			user.setUsername(rs.getString("USERNAME"));
			user.setEmail(rs.getString("EMAIL"));
			user.setPhoneNo(rs.getString("PHONE_NO"));
			user.setDateOfBirth(rs.getString("DATE_OF_BIRTH"));
			user.setAge();
			user.setAddress(rs.getString("ADDRESS"));
			user.setPhysicalDisability(rs.getString("PHYSICAL_DISABILITY"));
			user.setIdentityProof(rs.getString("IDENTITY_PROOF"));
			found = true;
			count++;
		}
		if (found == true) {
			return user;
		} else
			return null;
	}
	@Override
	public LinkedHashSet<User> getUsers() throws SQLException {
	
		String selectAllQuery = Constant.SELECT_ALL_QUERY;
		PreparedStatement ps = con.prepareStatement(selectAllQuery);
		ResultSet rs = ps.executeQuery();
		LinkedHashSet<User> users = new LinkedHashSet<User>();
		count =0;

		while (rs.next()) {
			
			User user = new User();
			user.setLoginId(rs.getString("LOGIN_ID"));
			user.setPassword(rs.getString("PASSWORD"));
			user.setUsername(rs.getString("USERNAME"));
			user.setEmail(rs.getString("EMAIL"));
			user.setPhoneNo(rs.getString("PHONE_NO"));
			user.setDateOfBirth(rs.getString("DATE_OF_BIRTH"));
			user.setAge();
			user.setAddress(rs.getString("ADDRESS"));
			user.setPhysicalDisability(rs.getString("PHYSICAL_DISABILITY"));
			user.setIdentityProof(rs.getString("IDENTITY_PROOF"));
			users.add(user);
			count++;
		}
		return users;
	}
	
	

}
