package com.jorawar;

public class Outer3 {
	
	private static int x=50;
	private int y;
	
	public Outer3(int y) {
		this.y = y;
	}
	
	void m1() {
		System.out.println("Outer method m1");
	}
	
	class Inner3{
		private int y;
		
		public Inner3(int y) {
			this.y = y;
		}
		
		void m2() {
			System.out.println("Inner method m2");
			System.out.println("Outer x=" + x );
			System.out.println("Inner y=" + y);
			System.out.println("Outer y=" + Outer3.this.y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer3 o3 = new Outer3(99);
		o3.m1();
		
		Inner3 i3 = o3.new Inner3(88);
		i3.m2();
	}

}
