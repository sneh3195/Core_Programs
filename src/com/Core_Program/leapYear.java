package com.Core_Program;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
    int year;
    System.out.println("Enter an year: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
    
     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
    	 System.out.println("the year a leap year");
     }else {
    	 System.out.println("the year is not a leap year");
     }
	}

}
