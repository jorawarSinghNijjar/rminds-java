package com.jorawar;

public class Outer4 {

	void m1() {
		System.out.println("Outer method m1");
		
		class Inner{
			void m2() {
				System.out.println("Inner method m2");
			}
		}
		
		Inner i4 = new Inner();
		i4.m2();
	}
	public static void main(String[] args) {
		
		Outer4 o4 = new Outer4();
		o4.m1();
		
	}

}
