package com.yedam.java.ch0501;import java.lang.reflect.InaccessibleObjectException;

public class ArrayCommonExample {
	public static void main(String[] args) {
		// 배열 선언 및 생성
		int[] intAray = null;
		// 배열 선언 후 생성
		intAray = new int[] { 1, 3, 4}; // 값을 가지고 있는 배열
		System.out.println("길이 : " +intAray.length);
		for(int i=0; i< intAray.length; i++) {
			System.out.println(i+")"+intAray[i]);
		}
		intAray = new int[5]; // 크기만 지정된 배열
		for(int i=0; i< intAray.length; i++) {
			System.out.println(i+")"+intAray[i]);
		}
	
	}
}
