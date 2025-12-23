package com.yedam.java.ch0402;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		String data = null;
		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택>");
			data = scanner.nextLine();
			String money = "";
			if(data.equals("1")) {
				System.out.print("예금액>");
				money = scanner.nextLine();
				balance += Integer.parseInt(money);
			}
			else if(data.equals("2")) {
				System.out.print("출금>");
				money = scanner.nextLine();
				if(Integer.parseInt(money)>balance) {
					System.out.println("잔고보다 많습니다.");
				}else{					
					balance -= Integer.parseInt(money);
				}
			}
			else if(data.equals("3")) {
				System.out.println("잔고>"+balance);
			}
			else if(data.equals("4")) {
				run = false;
			}
			else {
				System.out.println("메뉴가 잘못 입력됐습니다.");
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
