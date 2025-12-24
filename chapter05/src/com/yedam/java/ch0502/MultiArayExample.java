package com.yedam.java.ch0502;

public class MultiArayExample {
	public static void main(String[] args) {
		// 다차원 배열 => 참조타입 배열
		String[] strAry = { "신용권", "이자바" };

		// 2차원 배열
		int[][] intAry = null;
		intAry = new int[][] { { 1, 2 }, { 3, 4, 5 }, {6}};
		for (int i = 0; i < intAry.length; i++) {
			int[] currentAry = intAry[i];
			for (int j = 0; j < currentAry.length; j++) {
				int curVal = currentAry[j];
				System.out.printf("[%d][%d] : %d\n", i, j, curVal);
			}
		}
		
		intAry = new int[2][];
		intAry[0] = new int[] {1,2};
		intAry[1] = new int[] {3,4,5};
		for (int i = 0; i < intAry.length; i++) {
			int[] currentAry = intAry[i];
			for (int j = 0; j < currentAry.length; j++) {
				int curVal = currentAry[j];
				System.out.printf("[%d][%d] : %d\n", i, j, curVal);
			}
		}
		
		

	}
}
