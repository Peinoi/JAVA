package com.yedam.java.ch0203;

public class StringPromotionExample {
	public static void main(String[] args) {
		// +  연산 
		String str1 = String.valueOf(1 + 2 + 3); // String.valueOf()
		String str2 = 1 + 2 + "3";
		String str3 = 1 + "2" + 3;
		String str4 = "1" + 2 + 3;
		String str5 = "1" + (2+3);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 강제타입 변환 : 각 타입별 메서드 사용
		int val1 = Integer.parseInt("1234");
		double val2 = Double.parseDouble("2.5");
		double result = val1 + val2;
		System.out.println(result);
	}
}
