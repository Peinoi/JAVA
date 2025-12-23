package com.yedam.java.ch0402;

public class BreackContinueExample {
	public static void main(String[] args) {
		// continue <=> pass
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1)
				continue;
			for (int j = 1; j < 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
		// 중첩 반복문에서 break문;
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			boolean isExited = false;

			for (char lower = 'a'; lower <= 'z'; lower++) {
				if (lower == 'g') {
					isExited = true;
					break;
				}
				System.out.println(upper + "-" + lower);
			}
			if (isExited) {
				break;
			}
		}
		
		//레이블 outter => 안쪽에 있는 break로 레이블 있는 for문 종료
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				if (lower == 'g') {
					break Outter;
				}
				System.out.println(upper + "-" + lower);
			}

		}

	}
}
