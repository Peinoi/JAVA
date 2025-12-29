package com.yedam.java.ch0604;

public class Calculator {
	// 메소드 선언 : 반드시 객체 내부에 존재
	// 리턴타입 메소드 이름 ([매개변수,...]){}
	// 1) 전원 켜는 기능
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 2) 전원 끄는 기능
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	// 3) 더하기
	int plus(int x, int y){
		int result = x+y;
		return result;
	}
	// 매개변수의 갯수가 명확하지 않은 경우
	// 1. 배열로 선언
	int plus(int[] values) {
		int result = 0;
		for(int val : values)
		{
			result = result+ val;
		}
		return result;
	}
	
	// 2. 가변 파리미터로 선언 <=> javascript의 Rest Parameter랑 동일
	int minus(int ... values) {
		int result =0;
		for(int val : values) {
			result -= val;
		}
		return result;
	}
	
	// 4) 나누기
	double divid(int x, int y){
		double result = (double)x/(double)y;
		return result;
	}

	
	
}
