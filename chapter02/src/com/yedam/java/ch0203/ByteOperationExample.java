package com.yedam.java.ch0203;

public class ByteOperationExample {
	public static void main(String[] args) {
		// 정수 연산
		
		// 1) int 보다 밑의 타입을 기준으로  연산 => int로 자동 변환
		byte x = 30;
		byte y = 50;
//		byte z = (byte)(x+y);
		int z = x + y;
		System.out.println(z);
		// 2) long 타입이 포함될 경우 모두 long으로 자동 변환
		int a = 100;
		long b = 150L;
		long c = a + b;
		System.out.println(c);
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 ="3.9";
		int result = (int)(var2 + var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		
	}
}
