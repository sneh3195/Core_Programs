package com.Core_Program;

import java.util.Scanner;

public class power {

	static int power(int base, int exponent)
	{
		int power = 1;
		
		for(int i=1;i<=exponent;i++) 
			power=power*base;
		 return power;
		}	
        
	public static void main(String[] args) {
		 int base,exponent;
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("enter a base ");
	        base = input.nextInt();
	     
		 System.out.println("enter a exponent ");
		 exponent = input.nextInt();
		 
		 int pow = power(base,exponent);
		 System.out.println(base+"to the power" +exponent+ "is:" +pow);

	}

}
