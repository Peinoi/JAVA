package com.yedam.java.package1;

public class A {// default 접근
	// 생성자 => 접근제한자 제한 없음
	public A(boolean b) {
	}

	A(int i) {
	}

	private A(String s) {
	}

	A A1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	// 필드와 메서드
	public int field1;
	int field2;
	private int field3;

	public void method1() {
	};

	void method2() {
	};

	private void method3() {
	};
	
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();

	}
	
}
