package com.yedam.java.ch0402;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// 교제 182문제

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0) {
				sum += i;				
			}
		}
		System.out.println(sum);

		// 주사위
//		int ran, ran2,ransum = 0;
//		while (true) {
//			ran = (int) (Math.random() * 6) + 1;
//			ran2 = (int) (Math.random() * 6) + 1;
//			ransum = ran+ran2;
//			System.out.println("ran:"+ran+"ran2:"+ran2);
//			if(ransum == 5) {
//				break;
//			}
//		}
//		;

		// 4
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int x = 4;
				int y = 5;
				int z = (x*i)+(y*j) ;
				if (z == 60) {
					System.out.println("x= " +i + " y=" + j);
				}
			}
		}
		
		//5
		String star = "*";

		for(int i=0; i<4; i++) {
			System.out.println(star);
			star += "*";
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<i+1; j++) {				
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
		//6
		star = "*";
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println(star);
			star += "*";
		}
		
		int z =0;
		for(int i=4; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			++z;
			for(int k=0; k<z; k++) {				
				System.out.print("*");
			}
			System.out.println("");

		}
	}
}
