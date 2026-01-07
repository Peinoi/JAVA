package com.yedam.test;

import java.util.Random;
import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		// 문제 7번 도우서
		int ran = (int) (Math.random() * 49) + 1;
//		System.out.println(ran);
		boolean success = false;
		Scanner sc = new Scanner(System.in);
		while (!success) {
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			if (num == ran) {
				success = true;
				System.out.println("축하합니다!!");
			} else if (num < ran) {
				System.out.println("up 하세요!!");
			} else if (num > ran) {
				System.out.println("down하세요!!");
			}
		}
		sc.close();
	}

}
