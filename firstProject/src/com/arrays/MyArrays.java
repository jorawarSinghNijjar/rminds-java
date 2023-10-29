package com.arrays;

import java.util.Arrays;

class Obj{
	int x=0;
}
public class MyArrays {
	public static void main(String[] args) {
		// Different ways to declare arrays:
		int[] nums1 = new int[5];
		int[] nums2 = {3,2,1,5};
		int[] nums3 = new int[] {3, 8 ,6,04};
		int nums4[] = {5,6,7,8};
		
		System.out.println("nums1[2]= "+nums1[2]);
		System.out.println("nums2[2]= "+nums2[2]);
		System.out.println("nums3[2]= "+nums3[3]);
		System.out.println("nums4[2]= "+nums4[2]);
		
		
		// Checking default values by datatypes if not provided
		
		String[] str = new String[5];
		System.out.println("str[2]= "+str[2]);
		
		double[] db = new double[5];
		System.out.println("db[2]= "+db[2]);
		
		boolean[] bool = new boolean[5];
		System.out.println("bool[2]= "+bool[2]);
		
		Obj[] objArr = new Obj[5];
		System.out.println("objArr[2]= "+objArr[2]);
		
		char[] charArr = new char[5];
		System.out.println("charArr[2]= "+charArr[2]);
		
		charArr[3] = 'E';
		
		System.out.println(Arrays.toString(charArr));
	}
}
