package com.abstraction;

public class Admin extends User{

	public Admin(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println(super.getUsername() + "\tlogging in as Admin....");
	}

}
