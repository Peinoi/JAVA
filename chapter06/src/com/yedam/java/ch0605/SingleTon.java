package com.yedam.java.ch0605;

public class SingleTon {
	// private : 외부에서 접근할 수 없도록 처리
	// 1) 자기자신을 정적 필드로 가짐
	private final static SingleTon singleton = new SingleTon();
	// 2) 외부에서 new 연산자 호출 막음
	private SingleTon() {}
	// 3) 정적 메소드를 통해 내부에 선언된 필드를 반환
	public static SingleTon getInstance() {
		return singleton;
	}
}
