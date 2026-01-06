package com.yedam.java.ch1202.lambda;

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = (x, y) -> {
			int result = x + y;
			return result;
		};

		com = (x, y) -> {
			return x + y;
		};
		// 실행하는 코드가 한줄이고 return 구문일 경우
		// 중괄호와 함께 return도 생략
		com = (x, y) -> x + y;
		
		
	}
}
