package com.yedam.java.ch0401;

public class SwitchExample {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간 :  " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("아침회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("출근합니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("아침회의를 합니다.");
			break;
		case 'C':
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}
