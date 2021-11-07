package com.Core_Program;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		 int num1, num2, result;  
	       
		  Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of num1 and num2");  
	       num1 = sc.nextInt();  
	       num2 = sc.nextInt();  
	       System.out.println("before swapping numbers: "+num1 +"  "+ num2);  
	        
	       result = num1;  
	       num1 = num2;  
	       num2 = result;  
	       System.out.println("After swapping: "+num1 +"   " + num2);  
	       System.out.println( );  
	    }    
	 
		
	}


