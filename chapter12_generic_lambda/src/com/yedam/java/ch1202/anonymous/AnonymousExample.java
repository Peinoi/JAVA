package com.yedam.java.ch1202.anonymous;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 필드(익명객체) 사용
		anony.field.turnOn();
		// 로컬변수 (익명객체) 사용
		anony.method1();
		// 매개값(익명객체) 사용
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("SmartTv를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTv를 끕니다.");
			}
		});
		
	}
}
