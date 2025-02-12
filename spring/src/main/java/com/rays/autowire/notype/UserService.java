package com.rays.autowire.notype;

public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void testadd() {

		userDao.add();

	}

}
