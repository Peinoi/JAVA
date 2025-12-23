package com.yedam.java.ch0401;

public class ForCommonExample {
	public static void main(String[] args) {
		// for 문 반복 획수 2 ) 무한루프에 빠질 위험이적음
		// 정수 1~ 10 까지 출력
//		for(int i =10; i>0; i--) {
//			System.out.println(i);
//		}
		
		//실수 0.1 ~ 0.9까지 출력
//		for(int i=1; i<10; i++) {
//			System.out.println((float)i/10);
//		}
		for(float i=0.1f; i<1.0f; i+=0.1f) {
			System.out.println(i);
		}

	
	}
}

























