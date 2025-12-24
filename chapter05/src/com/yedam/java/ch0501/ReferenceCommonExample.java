package com.yedam.java.ch0501;

public class ReferenceCommonExample {
	public static void main(String[] args) {
		
		String msg = "Hello World";
		boolean result = firstMethod();
		
		System.out.println(System.identityHashCode(msg)); // 메모리주소
		System.out.println(msg);
		System.out.println("result : " + result);
	}
	
	public static boolean firstMethod() {
		char v1 = 'A';
		
		if(v1 == 'A') {
			int v2 = 100;
			double v3 = 3.14;
		}
		boolean v4 = true;
		return v4;
	}
}
