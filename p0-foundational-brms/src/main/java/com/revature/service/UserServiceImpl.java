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
					signIn();
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
	private void signIn() {
		try {
			do {
				logger.info("-----Select from below options for further process-----");
				logger.info("1.Update User Details");
				logger.info("2.Dispaly User Details");
				logger.info("3.Delete User Details");
				logger.info("4.Dispaly All User Details");
				logger.info("5.Exit");
				logger.info("Enter your choice");

				int choice = scan.nextInt();
				scan.nextLine();

				switch (choice) {

				case 1:
					logger.info("Enter login Id which you want to update : ");
					String loginIdToUpdate = scan.nextLine();
					for (User i : user.getUsers()) {
						if (i.getLoginId().equals(loginIdToUpdate)) {
							user.updateUserDetails(i);
							break;
						}
					}
					break;
				case 2:
					logger.info("Enter your loginId you want to view: ");
					String loginId = scan.nextLine();
					logger.info(user.getUser(loginId));
					break;
				case 3:

					logger.info("Enter your loginId you want to delete : ");
					String loginIdToDelete = scan.nextLine();
					user.delete(loginIdToDelete);
					logger.info("Your's LoginId Deleted Successfully");
					break;
				case 4:
					logger.info("list of users" + "\n" + user.getUsers());
					break;
				case 5:
					System.exit(0);

				default:
					logger.info("Enter between 1and 6 only");
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