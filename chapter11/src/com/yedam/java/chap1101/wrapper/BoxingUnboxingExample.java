package com.yedam.java.chap1101.wrapper;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// 박싱 : 기본타입 -> Wrapper클래스
		Integer obj1 = new Integer(100);
		// 자동박싱
		Integer obj2 = 200;
		Integer obj3 = 200;
		
		if (obj2 == obj3) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}

		if (obj2.equals(obj3)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		// 언박싱 : Wrapper 클래스 -> 기본 타입
		int value1 = obj1.intValue();
		// 자동 언박싱
		int value2 = obj2;
		int value3 = obj3;
		// 연산에선 자동으로 언박싱을 진행
		int result = obj2 * 2 + 100 + obj3;
		System.out.println("result : "+result);
		
	}
}
