package com.yedam.java.ch0402;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData = null;
		do {
			inputData = scanner.nextLine();
			System.out.println(inputData);
		} while (!inputData.equals("q"));
		scanner.close();

	}
}
