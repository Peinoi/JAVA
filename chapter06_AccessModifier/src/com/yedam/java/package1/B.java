package com.yedam.java.package1;

public class B { 
	A a; // 
	
	A A1 = new A(true);
	A a2 = new A(1);
//	A a3 = new A("문자열");
	
	
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // -> private으로 클래스 외부에선 사용 불가
		
		a.method1();
		a.method2();
//		a.method3(); // -> private으로 클래스 외부에선 사용 불가

	}
}
