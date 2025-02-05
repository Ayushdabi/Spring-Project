package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBankBean {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("BankBean.xml"));

		BankBean bean = (BankBean) factory.getBean("bank");

		System.out.println(bean.getAcc());
		System.out.println(bean.getName());

	}

}
