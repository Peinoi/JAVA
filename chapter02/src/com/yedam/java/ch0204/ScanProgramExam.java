package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScanProgramExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData = null;

		while (true) {
			inputData = scanner.nextLine();
			System.out.printf("입력된 문자열 : %s \n", inputData);
			if (inputData.equals("q")) {
				// 소문자 q가 입력되는 경우 프로그램을 종료
				break;
			}
		}
		scanner.close();
	}
}



