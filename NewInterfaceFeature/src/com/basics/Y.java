package com.basics;

public interface Y {
	default void bye() {
		System.out.println("Bye from Y");
	}
}
