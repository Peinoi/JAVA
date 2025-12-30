package com.yedam.java.ch0702.promotion;

public class PromotionExample {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("자식 클래스인 Child 타입");
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		Parent parent = child;
		System.out.println("부모 클래스인 Parent 타입");
		parent.method1();
		parent.method2();
		// 자동타입변환 : 자식클래스만의 고유 멤버를 사용 할 수 없음
		// parent.method3();
		
		System.out.println();
		parent = new GrandChild();
		System.out.println("부모 클래스인 Parent 타입 - GrandChild");
		parent.method1();
		parent.method2();
		
	}

}
