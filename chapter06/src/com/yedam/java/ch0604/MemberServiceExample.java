package com.yedam.java.ch0604;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService mem = new MemberService();
		boolean result = mem.login("hong", "12345");
		if (result) {
			System.out.println("로그인");
			mem.logout("hong");
		} else {
			System.out.println("아이디 비번 잘못됨");
		}
	}
}
