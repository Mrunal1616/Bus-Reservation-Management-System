package com.revature.test.suite.in.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.revature.config.DatabaseConnectionTest;
import com.revature.dao.impl.UserDaoImplTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({ DatabaseConnectionTest.class,UserDaoImplTest.class })
public class JunitTestSuite {

}
