package com.rays.bean;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultiple {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");

		UserBean bean = (UserBean) context.getBean("user");

		BankBean bank1 = (BankBean) context.getBean("bank");

		System.out.println("User Name=" + bean.getLogin());
		System.out.println("User Pass=" + bean.getPassword());

		System.out.println("Acc = " + bank1.getAcc());
		System.out.println("Name = " + bank1.getName());

	}

}
