package com.yedam.java.ch0701;

// 자식 클래스
public class Computer extends Calculator {


	//	@ : 어노테이션, 덧붙이는 기능s
	@Override // 컴파일 할 때 메소드 오버라이딩 체크해
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}
	
	
	
}
