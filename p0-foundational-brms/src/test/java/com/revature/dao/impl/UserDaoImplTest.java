package com.revature.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.revature.dao.UserDao;
import com.revature.model.User;

public class UserDaoImplTest {
	UserDao user;
	
	@Before
	public void setUp() throws SQLException{
		System.out.println("------UserDaoImpl object created before every testcase-------");
		user = new UserDaoImpl();
	}
	
	@Test
	public void testDelete() {
		User deleted =null;
		try {
			user.delete("Mrunal1616");
			deleted = user.getUser("Mrunal1616");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		assertNull(deleted);
	}
	@Test
	public void testGetUsers() throws SQLException {
		user.getUsers();
		assertNotEquals(0,UserDaoImpl.count);

	}
	@Test
	public void testGetUser() throws SQLException{
		user.getUser(null);
		assertEquals(0,UserDaoImpl.count);
		
	}

	
}

