package com.rays.autowire.byname;

public class UserService {

	private UserDao UserDao;

	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}

	public void testadd() {

		UserDao.add();

	}

}
