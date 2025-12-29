package com.yedam.java.ch0604;

import com.yedam.java.ch0605.SingleTon;

public class ReferenceExample {
	public static void main(String[] args) {
		int[] dataList = { 1, 3, 5, 7 };
		Computer com = new Computer();

		int result = com.plus(dataList);
		System.out.println(result);

		for (int i = 0; i < dataList.length; i++) {
			System.out.println(dataList[i]);

		}

	}
}
