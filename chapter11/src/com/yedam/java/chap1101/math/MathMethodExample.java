package com.yedam.java.chap1101.math;

public class MathMethodExample {
	public static void main(String[] args) {
		// ceil : 올림값
		double v1 = Math.ceil(5.3); // 6
		double v2 = Math.ceil(-5.3); // -5
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);

		// floor : 버림값
		double v3 = Math.floor(5.3); // 5
		double v4 = Math.floor(-5.3); // -6
		System.out.println("v3 : " + v3);
		System.out.println("v4 : " + v4);

		// rint : 가까운 정수의 실수 값
		// .5 일때 딱수 정수로 반올림
		// .5는 가까운 짝수로 감 4.5는 4 | 5.5는 6으로 가까운 짝수 찾아감
		double v5 = Math.rint(5.3); // 5
		double v6 = Math.rint(4.5); // 4
		double v7 = Math.rint(5.5); // 6
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		System.out.println("v7 : " + v7);

		// round : 반올림값
		long v8 = Math.round(5.3); // 5
		long v9 = Math.round(4.5); // 5
		long v10 = Math.round(5.5); // 6
		System.out.println("v8 : " + v8);
		System.out.println("v9 : " + v9);
		System.out.println("v10 : " + v10);
		
	}
}
