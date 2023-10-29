package com.arrays;

import java.util.Arrays;

public class My2DArray {

	public static void main(String[] args) {
		
		int[][] arr2D = new int[3][4];
		
		int startVal = 10;
		
		for(int i=0; i < 3; i++) {
			for(int j=0; j<4; j++) {
				arr2D[i][j] = startVal;
				startVal+=10;
			}
		}
		
		for(int[] arr: arr2D) {
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
