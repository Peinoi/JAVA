package com.yedam.java.ch0703;

// 부모 클래스
// 추상 클래스 : 클래스를 만들때 정의할 공통사향(필드, 메소드)
//			=> 추상 메소드 : 강제성을 띄는 메소드
public abstract class Animal {
	// 필드
	public String kind;
	// 생성자

	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메서드 : 일반 메서드와 달리 실행 블럭이 없다.
	// => 메서드 오버라이딩용
	public abstract void sound();

}
