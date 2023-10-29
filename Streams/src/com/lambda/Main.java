package com.lambda;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Main{
	private static final String username = "jorawar";
	private static final String password = "singh";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username: ");
		String username = sc.nextLine();

		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		sc.close();

//		 Defining login method
		Login<String, String> login = (u, p) -> {
			if (u.equals(Main.username) && p.equals(Main.password)) {
				System.out.println("You are successfully logged in !!!");
			} else {
				System.out.println("Wrong credentials !!!");
			}

		};

		login.apply(username, password);
	
		
	}

}
