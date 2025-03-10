package com.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("child.xml");

		/*
		 * TestBean testBean = (TestBean) context.getBean("testBean");
		 * 
		 * System.out.println(testBean.toString());
		 */

		DerivedTestBean derivedTestBean = (DerivedTestBean) context.getBean("derivedTestBean");

		System.out.println(derivedTestBean.toString());

		TestBean abstractBean = (TestBean) context.getBean("derivedTestBean");

		System.out.println(abstractBean.toString());

	}

}
