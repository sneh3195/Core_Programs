package com.Functional_Program;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] array = new int[50][50]; 
		
		System.out.print(" Please enter the size of first array A1: ");
		int A1 = input.nextInt();
		
		System.out.print(" Please enter the size of second array A2: ");
		int A2 = input.nextInt();
		
		
		 for (int i = 0; i < A1; i++) {
			 for (int j = 0; j < A2; j++) {
					System.out.print(" Please enter number which you want to store in array: ");
					array[i][j] = input.nextInt();
				}
		 }
		 System.out.println(" The array: ");
			
			for (int i = 0; i < A1; i++) {
				System.out.println();
				for (int j = 0; j < A2; j++) {
					System.out.print(" " + array[i][j]);
				}
			}
			
			input.close();	
			 
			 
			 
	}
}
