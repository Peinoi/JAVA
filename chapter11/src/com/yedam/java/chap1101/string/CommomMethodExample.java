package com.yedam.java.chap1101.string;

public class CommomMethodExample {
	public static void main(String[] args) {
		// charAt
		String ssn = "010624-3230123";
		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + gender);
		}

		// indexOf : 실제 위치 확인 2) 포함 여부
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println("해당 위치: " + location);

		if (subject.indexOf("자바") > -1) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}

	}
}
