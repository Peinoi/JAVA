package com.yedam.java.package2;

import com.yedam.java.package1.A;
import com.yedam.java.package1.B;

public class C {
	A a; // default로 선언된 경우 다른 패키지에서는 없는 존재
	B b; // public로 선언된 경우 어디서든 자유롭게 접근 가능
	
	A A1 = new A(true);
//	A a2 = new A(1); // -> default로 다른 패키지에선 아예 사용 불가
//	A a3 = new A("문자열"); // -> private으로 클래스 외부에선 사용 불가
	
	
	
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1; // -> default로 다른 패키지에선 아예 사용 불가
//		a.field3 = 1; // -> private으로 클래스 외부에선 사용 불가
		
		a.method1();
//		a.method2(); // -> default로 다른 패키지에선 아예 사용 불가
//		a.method3(); // -> private으로 클래스 외부에선 사용 불가

	}
}
