package com.rays.bean;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class TestBank {

	public static void main(String[] args) {

		BankBean bean = new BankBean();

		bean.setAcc("5522");
		bean.setName("Abhshek");

		System.out.println(bean.getName());
		System.out.println(bean.getAcc());
	}
}
