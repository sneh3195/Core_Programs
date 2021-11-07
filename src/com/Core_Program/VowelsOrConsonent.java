package com.Core_Program;

import java.util.Scanner;

public class VowelsOrConsonent {

	public static void main(String[] args) {
       System.out.println("Enter a character :");
       Scanner input = new Scanner(System.in);
       char ch = input.next().charAt(0);
       if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u') {
    	   System.out.println("Given character is vowel");
       }else {
    	   System.out.println("Given character is consonent");

       }
	}

}
