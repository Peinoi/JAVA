package com.yedam.java.chap1101.object;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");

		if (obj1 == obj2) {
			System.out.println("동일한 인스턴스입니다.");
		}
		else {
			System.out.println("서로 다른 인스턴스입니다.");
		}
		
		
		if (obj1.equals(obj2)) {
			System.out.println("동일한 인스턴스입니다.");
		}
		else {
			System.out.println("서로 다른 인스턴스입니다.");
		}
		
	}
}
