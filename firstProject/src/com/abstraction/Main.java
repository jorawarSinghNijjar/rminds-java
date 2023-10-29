package com.abstraction;

public class Main {
	public static void main(String[] args) {
		
		User admin = new Admin("john","123");
		User client = new Client("Bannie","123");
		
		admin.login();
		client.login();
		
		admin.logout();
		client.logout();
	}
}
