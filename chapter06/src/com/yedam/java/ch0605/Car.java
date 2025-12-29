package com.yedam.java.ch0605;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
		testMethotd();
	}
	static void testMethotd() {
		System.out.println("testMethotd");
	};
	
	// 정적 메소드 : 인스턴스 멤버를 사용 불가
	public static void main(String[] args) {
		testMethotd();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		System.out.println(myCar);

	}
}


















