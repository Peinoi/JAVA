package com.yedam.java.ch1202.anonymous;

// 익명 구현 객체를 활용
public class Anonymous {
	// 필드
	RemoteControl field = new RemoteControl() {
		// 익명 구현 객체
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	// 메소드
	void method1() {
		// 로컬변수로 선언
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}

		};
		localVar.turnOn();
	}

	// 매개변수로 익명구현 객체 사용
	public void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
