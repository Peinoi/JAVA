package com.yedam.java.ch1202.lambda;

public class CommonExample {
	public static void main(String[] args) {
		// 람다식의 활용 => 콜백 함수
		action((x, y) -> {
			int result = x + y;
			System.out.println("결과 : " + result);
		});
		// 메소드 참조 : 이중 콜론 연산자
		action((x, y) -> Math.max(x, y));
		action(Math::max);
	}

	public static void action(Calculable cal) {
		int x = 10;
		int y = 4;
		cal.calculate(x, y);
	}

}
