package com.Core_Program;

import java.util.Scanner;

public class HarmonicNumber {

	// static double nthHarmonic(int N)
	//  {
		//  float harmonic = 1;
		
		//  for(int i =2;i<=N;i++) {
			//  harmonic +=(float)1 / i;
		  //}
		  
		 // return harmonic;  
	  //}
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Harmonic Number :- ");
		float  result = 0 ;
        int Nth_Number = input.nextInt();
        for(float i=1;i<=Nth_Number;i++) {
    		System.out.println("step  "+ i+" is  :- " + (1/i));
			result  = result + (1/i);
			System.out.println("Harmonic Value of "+i+"th is  :- " + result);
		}
		System.out.println("Harmonic Value of Nth is  :- " + result);
	}

}

