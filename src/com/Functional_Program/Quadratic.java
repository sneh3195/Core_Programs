package com.Functional_Program;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
		
		System.out.print(" enter the value of a: ");
		double a = input.nextDouble();
		
		System.out.print(" enter the value of b: ");
		double b = input.nextDouble();
		
		System.out.print(" enter the value of c: ");
		double c = input.nextDouble();
		
		double delta = b*b - 4.0*a*c;
		if(delta>0.0)
		{
		double x1 = (-b + Math.pow(delta, 0.5)) /( 2.0*a);
		double x2 = (-b - Math.pow(delta, 0.5)) /(2.0*a);
		
		System.out.println(" The two roots are: " + x1 + " and " + x2);
		}else if(delta == 0) {
		
			double x1 = -b/(2.0*a);
		
		}else {
		
			System.out.println("roots are not Real");
		}
		input.close();
	}


}
