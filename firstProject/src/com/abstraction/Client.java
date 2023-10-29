package com.abstraction;

public class Client extends User{

	public Client(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println(super.getUsername() + "\tlogging in as Client....");
	}

}
