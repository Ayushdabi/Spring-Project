package com.rays.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleXml {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml", "BankBean.xml");

		UserBean bean = (UserBean) context.getBean("user");

		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());

		BankBean bankBean = (BankBean) context.getBean("bank");

		System.out.println(bankBean.getName());
		System.out.println(bankBean.getAcc());

	}
}