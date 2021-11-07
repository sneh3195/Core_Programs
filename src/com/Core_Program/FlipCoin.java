package com.Core_Program;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int headCount=0;
		double percentage;
		int tailCount=0;
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter the number of times to flip the coins:-");
		double flipTime = input.nextInt();
		for(int i=0;i<flipTime;i++) {
			
			if(Math.random()<0.5){
				tailCount += 1;
				System.out.println("Tails");
				percentage = (tailCount/flipTime)*100;
				System.out.println("Percentage of tails:" +percentage);

				}else{
					headCount += 1;
			
System.out.println("Heads");
				percentage = (headCount/flipTime)*100;
				System.out.println("Percentage of heads:" + percentage);
				
				}
			
			System.out.println("Tails count:" +tailCount);
			System.out.println("Heads count:" +headCount);
			
		}

	}

	}


