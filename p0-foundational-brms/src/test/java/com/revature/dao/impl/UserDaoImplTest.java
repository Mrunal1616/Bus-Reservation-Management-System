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
			user.delete("mrunal");
			deleted = user.getUser("mrunal");
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

/*
 * final Logger logger = Logger.getLogger(UserDaoImplTest.class); UserDao
 * userDao;
 * 
 * @Before public void setUp() throws Exception {
 * logger.info("---------UserDaoImplTest before every test---------"); userDao =
 * new UserDaoImpl();
 * 
 * }
 * 
 * @Test public void testInsertUser() { User toBeInserted = new User("user1",
 * "user1pass@123"); User inserted = null; try { userDao.addUserDetails();
 * inserted = userDao.getUser(toBeInserted.getUserId()); } catch (SQLException
 * e) { e.printStackTrace(); } assertEquals(toBeInserted.getPassword(),
 * inserted.getPassword()); }
 * 
 * @Test public void testDeleteUser() { User deleted = null; try {
 * userDao.delete("user1"); deleted = userDao.getUser("user1"); } catch
 * (SQLException e) { e.printStackTrace(); } assertNull(deleted); }
 */
