package com.yedam.java.ch0203;

public class OperationExample {
	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		int z = x/y;
		double result = (double)x/y;
		System.out.println(z);
		System.out.println(result);
		
		//실수 연산 
		// 1) 동일한 타입일 경우 해당 타입으로 연산
		float a = 0.12F;
		float b = 0.1F;
		float c = a + b;
		// 2) double 타입이 포함된 경우 모두 double로 변환
		float v1 = 0.12F;
		double v2 = 0.1;
		double v3 = v1 + v2;
		System.out.println(v3);
		
	}
}
