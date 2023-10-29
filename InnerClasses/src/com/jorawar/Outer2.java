package com.jorawar;

import com.jorawar.Outer.Inner;

public class Outer2 {
	
	static void m1() {
		System.out.println("Outer2 static method m1");
	}
	
	static class Inner2{
		void m2() {
			System.out.println("Inner2 method m2");
		}
		
		static void m3() {
			System.out.println("Inner2 static method m3");
		}
	}
	public static void main(String[] args) {
		
		Outer2.m1();
		Inner2.m3();
		
		Inner2 i2 = new Inner2();
		i2.m2();
		
//		Outer o1 = new Outer();
//		Inner i1 = o1.new Inner();
//		i1.m2();
	}

}
