package com.basics;

public interface X {
	void hello();
	default void bye() {
		System.out.println("Bye from X");
	}
}
