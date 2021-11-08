package com.Functional_Program;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	System.out.print(" Please enter the value of temperature : t(F): ");
		
		double t = input.nextDouble();
			if(t > 50) {
			
			System.out.println(" Please enter a temp value that is less than 50");
		
			input.close();
		
			return;
	}
	System.out.print(" Please enter the value of velocity: v(Mph): ");
	
	double v = input.nextDouble();
		if(v > 120 || v < 3) {
		
		System.out.println(" Please enter a velocity value that is between 3 and 120");
		
		input.close();
		
		return;
	}
		double wind = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
	
		System.out.println(" The wind speed is: " + wind);
		
		input.close();
	
	
	
	
	
	}

}
