package com.revature.service;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.constants.Constant;
import com.revature.dao.UserDao;
import com.revature.dao.impl.UserDaoImpl;
import com.revature.model.User;

public class UserServiceImpl implements UserService{
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	UserDao user = new UserDaoImpl();
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		UserService service = new UserServiceImpl();
		service.login();
	}

	@Override
	public  void login()  {
		try {
			
			do {
				logger.info(Constant.WELCOME_MESSAGE );
				logger.info(Constant.SIGN_IN);
				logger.info(Constant.SIGN_UP);
				logger.info(Constant.EXIT);
				
				int choice = scan.nextInt();
				scan.nextLine();
				switch (choice) {
				case 1:
					authentication();
					break;
				case 2:
					signUp();
					break;
				case 3:
					exit();
					break;
				default:
					logger.info("\t\t\tWrong option selected!");
				}
				}
			while(true);

			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}


	private void signUp() throws SQLException {
		user.addUserDetails();
	}
	private void authentication() throws SQLException {
		logger.info("Enter loginid : ");
		String logId = scan.nextLine();
		logger.info("Enter password : ");
		String pass = scan.nextLine();
		int flag=0;
		for (User i : user.getUsers()) {
			if (i.getLoginId().equals(logId) && i.getPassword().equals(pass)) {
				logger.info("You have logged in Successfully");
				signIn(logId);
				flag=1;
				break;
			}
		}
		if(flag !=1) {
			logger.info("Please Enter correct loginId and password");
		}
	}
	private void signIn(String loginId) {
		try {
			do {
				logger.info("-----Select from below options for further process-----");
				logger.info("1.Update User Details");
				logger.info("2.Dispaly User Details");
				logger.info("3.Delete User Details");
				logger.info("5.Exit");
				logger.info("Enter your choice");

				int choice = scan.nextInt();
				scan.nextLine();

				switch (choice) {

				case 1:
					for (User i : user.getUsers()) {
						if (i.getLoginId().equals(loginId)) {
							user.updateUserDetails(i);
							break;
						}
					}
					break;
				case 2:
					logger.info(user.getUser(loginId));
					break;
				case 3:
					user.delete(loginId);
					logger.info("Your's LoginId Deleted Successfully");
					break;
				case 4:
					System.exit(0);
				default:
					logger.info("Enter between 1 and 4 only");
					break;

				}
			} while (true);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void exit() {
		logger.info(Constant.exitMessage);
	}
}