package com.yedam.java.ch0604;

public class Computer {

	int plus(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			System.out.println(values[i]);
			values[i] *=2 ;
		}
		return sum;
	}
}
