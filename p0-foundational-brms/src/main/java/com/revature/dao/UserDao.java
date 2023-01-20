package com.revature.dao;

import java.sql.SQLException;
import java.util.LinkedHashSet;

import com.revature.model.User;

public interface UserDao {
	
	public int addUserDetails() throws SQLException;
	
	public int updateUserDetails(User user) throws SQLException;
	
	public int delete(String loginId) throws SQLException;
	
	public User getUser(String loginId) throws SQLException;

	public LinkedHashSet<User> getUsers() throws SQLException;	

	
	

}
