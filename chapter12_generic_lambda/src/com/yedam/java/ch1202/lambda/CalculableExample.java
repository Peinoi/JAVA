package com.yedam.java.ch1202.lambda;

public class CalculableExample {
	public static void main(String[] args) {
		Calculable commmon = new Calculable() {

			@Override
			public void calculate(int x, int y) {
				int result = x + y;
				System.out.println("결과 : " + result);
			}
		};
		commmon.calculate(10, 15);

		// 람다식을 작성하는 기본
		Calculable test = (a, b) -> {
			int result = a + b;
			System.out.println("결과 : " + result);
		};
		test.calculate(10, 15);
		
		
	}

}
