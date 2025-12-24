package com.yedam.java.ch0501;

import java.util.Arrays;

public class ArrayTestExample {
	public static void main(String[] args) {
		// 문제 : 1, 4, 9, 2, 5 중 최대값, 최소값 구하기
		int[] ary = { 1, 4, 9, 2, 5 };
		int max = ary[0];
		int min = ary[0];

		for (int i = 0; i < ary.length; i++) {
			int current = ary[i];
			if (current > max) {
				max = current;
			}
			if (current < min) {
				min = current;
			}
		}
		System.out.println("최소값 : " + min + " 최대값 : " + max);

		Arrays.sort(ary);
		System.out.println("최소값 : " + ary[0] + " 최대값 : " + ary[ary.length - 1]);

	}

}
