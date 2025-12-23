package com.yedam.java.ch0401;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		// IF문 : 조건식이 참인 경우만 확인
		if (score >= 90) {
			System.out.println("점수가 90 보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		// IF ~ ELSE : 조건식이 참과 거짓, 각각 확인
		if (score >= 60) {
			System.out.println("점수가 60점 이상입니다.");
			System.out.println("해당 과목은 통과 되었습니다.");
		} else {// 위에 선언된 모든 조건식을 만족하지 못한 경우
			System.out.println("점수가 60점 미만입니다.");
			System.out.println("해당 과목은 재수강 대상입니다.");
		}

		// IF ~ ELSE IF ~ ELSE : 조건식이 참과 거짓, 각각 확인
		if (score >= 90) {
			System.out.println("과목 등급은 A입니다.");

		} else if (score >= 80) {// 위에 선언된 모든 조건식을 만족하지 못한 경우
			System.out.println("과목 등급은 B입니다.");
		} else if (score >= 70) {// 위에 선언된 모든 조건식을 만족하지 못한 경우
			System.out.println("과목 등급은 C입니다.");
		} else if (score >= 60) {// 위에 선언된 모든 조건식을 만족하지 못한 경우
			System.out.println("과목 등급은 D입니다.");
		} else {// 위에 선언된 모든 조건식을 만족하지 못한 경우
			System.out.println("과목 등급은 F입니다.");
		}
		score = 48;
		switch (score / 10) {
		case 10:
			System.out.println("10");
			break;
		case 9:
			System.out.println("9");
			break;
		case 8:
			System.out.println("8");
			break;
		case 7:
			System.out.println("7");
			break;
		case 6:
			System.out.println("6");
			break;
		default:
			System.out.println("등급 f");

		}
	}
}
