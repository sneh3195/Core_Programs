package com.Core_Program;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number ::");
      int num = input.nextInt();
      
      if(num % 2 == 0) {
    	  System.out.println("The number is even  number");
      }else {
    	  System.out.println("The number is odd  number");

      }
	}

}
