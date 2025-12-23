package com.yedam.java.ch0204;
import java.util.Scanner; // JDK 내장 라이브러리 중 하나를 사용하겠다고 선언.
public class ScannerCommonExample {
	public static void main(String[] args) {
		// 표준 입력장치(System.in/키보드)를 통해 값을 읽어들이는 객체
		Scanner scanner = new Scanner(System.in);
		System.out.print("텍스트를 입력해 주세요 : ");
		String inputData = scanner.nextLine();
		System.out.println(inputData);
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
