package com.yedam.java.chap1002;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			// 특정 클래스 자체에 대한 정보를 가지는 Class
			Class clazz = Class.forName("java.lang.String2");
			clazz.getMethods(); // 특정 클래스가 가지고 있는 메서드 목록
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("종료");
		}
	}
}
