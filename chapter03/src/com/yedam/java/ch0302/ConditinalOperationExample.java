package com.yedam.java.ch0302;

public class ConditinalOperationExample {
	public static void main(String[] args) {
		// 삼항 연산자 => 조건식 ? 참일 때 깞 : 거짓일 때 깞
		
		int score = 87;
		char grade = score > 90 ? 'A' : 'B';
		String message = " 최종결과 : " + (score> 90 ? 'A': 'B');
		System.out.println("성적 : "+grade + message);
		
		if(score > 90) {
			grade = 'A';
		}
		else {
			grade = 'B';
		}
	}
}
