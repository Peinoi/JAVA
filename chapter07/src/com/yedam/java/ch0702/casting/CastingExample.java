package com.yedam.java.ch0702.casting;

public class CastingExample {
	public static void main(String[] args) {
		// 강제 타입 변환의 위험성
		Parent p = new Parent();
		if (p instanceof Child) {
			Child c = (Child) p;
			c.method1();
			c.method2();
			c.method3();
		}else {
			System.out.println("해당 인스턴스는 Child 객체가 아닙니다.");
		}
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		// => 자식 클래스의 고유멤버를 써야하는 경우
		child = (Child)parent;
		child.method3();
	}
}
