package com.rays.bean;

public class BankBean {

	public String name = null;
	public String Acc = null;

	public BankBean() {
		// TODO Auto-generated constructor stub
	}

	public BankBean(String name, String Acc) {

		this.name = name;

		this.Acc = Acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcc() {
		return Acc;
	}

	public void setAcc(String acc) {
		Acc = acc;
	}

}
