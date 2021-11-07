package com.Core_Program;

import java.util.Scanner;

public class QuotientAndReminder {

	public static void main(String[] args) {
           System.out.println("Enter the value of num1 and num2");
           Scanner input = new Scanner(System.in);
           int num1 = input.nextInt();
           int num2 = input.nextInt();
           int quotient = 0;
           int reminder = 0;
           quotient = num1/num2;
           reminder = num1 % num2;
           
           System.out.println("Quotient when" +num1 + "/" +num2+ "is: " +quotient);
           System.out.println("Reminder when" +num1 + "is divided by  " +num2+ "is: " +reminder);

	}

}
