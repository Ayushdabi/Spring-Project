package com.rays.autowire.bytype;

public class UserService {

	private UserDao UserDao;

	public void setUserDao(UserDao userDao) {
		UserDao = userDao;
	}

	public void testadd() {

		UserDao.add();

	}

}
