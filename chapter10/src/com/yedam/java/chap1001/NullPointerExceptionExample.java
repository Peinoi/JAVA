package com.yedam.java.chap1001;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null; // 참조 인스턴스가 없음
		System.out.println(data.toString());
		System.out.println("프로그램 종료");
	}
}
