package com.yedam.test;

import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		// 문제 8번 도우서
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 : ");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				System.out.print("예금액 : ");
				int charge = Integer.parseInt(sc.nextLine());
				money += charge;
			} else if (select == 2) {
				System.out.print("출금액 : ");
				int charge = Integer.parseInt(sc.nextLine());
				if (money < charge) {
					System.out.println("잔액이 부족합니다!");
					System.out.println("출금 가능액 : " + money + "원");
				} else {
					money -= charge;
				}
			} else if (select == 3) {
				System.out.println("현재 잔액 : " + money + "원");
			} else if (select == 4) {
				run = false;
				System.out.println("이용해 주셔서 갑사합니다.");
			} else {
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
			}
		}
		sc.close();
	}
}
