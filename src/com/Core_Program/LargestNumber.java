package com.Core_Program;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
         int num1,num2,num3,largest,temp;
         Scanner input = new Scanner(System.in);     
         System.out.println("Enter the first number:");  
         num1 = input.nextInt();
         System.out.println("Enter the second number:");  
	     num2 = input.nextInt();
	     System.out.println("Enter the third number:");  
	     num3 = input.nextInt();
	     temp = num1>num2?num1:num2;
	     largest = num3>temp?num3:temp;
	     System.out.println("The largest number is: " +largest);
	}

}
