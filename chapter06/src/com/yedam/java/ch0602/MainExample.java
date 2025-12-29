package com.yedam.java.ch0602;
// 실행 클래스 : main 메소드를 포함하고 있는 실행 전용 클래스
public class MainExample {
	public static void main(String[] args) {
		//객체를 사용하기 위해서는 인스턴스가 필요 => new 연산자
		Car myCar = new Car();
		
		// 필드 사용 : .(dot : 도트, 닷)를 통해 접근
		System.out.println("제조사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("컬러 : "+myCar.color);
		System.out.println("최고 속도 : "+myCar.maxSpeed);
		System.out.println("현재 속도 : "+myCar.currentSpeed);
		
		
		// 필드값 변경
		myCar.currentSpeed = 60;
		System.out.println("변경 된 속도 : "+myCar.currentSpeed);
	}
}
