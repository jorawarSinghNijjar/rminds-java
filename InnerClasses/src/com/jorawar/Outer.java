package com.jorawar;

public class Outer {

	void m1() {
		System.out.println("Outer method m1");
	}
	
	class Inner{
		void m2() {
			System.out.println("Inner method m2");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o1 = new Outer();
		o1.m1();
		
		Inner i1 = o1.new Inner();
		i1.m2();
	
	}

}
