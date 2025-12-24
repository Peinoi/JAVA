package com.yedam.java.ch0601;

import java.util.Scanner;

public class Example223p06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				if(scores != null) {
					System.out.println("이미 학생 수를 입력하셨습니다.");
					continue;
				}
				System.out.print("학생수> ");
				int stds = Integer.parseInt(scanner.nextLine());
				scores = new int[stds];
			}
			else if(selectNo == 2) {
				if(scores == null) {
					System.out.println("학생 수를 입력해주세요.");
					continue;
				}
				for(int i=0; i<scores.length; i++) {
					System.out.print("score["+i+"]> ");
					int score = Integer.parseInt(scanner.nextLine());
					scores[i] = score;
				}
				
			}
			else if(selectNo == 3) {
				if(scores == null) {
					System.out.println("학생 수를 입력해주세요.");
					continue;
				}
				for(int i=0; i<scores.length; i++) {
					System.out.println("score["+i+"]> " + scores[i]);
				}
				
			}
			else if(selectNo == 4) {
				if(scores == null) {
					System.out.println("학생 수를 입력해주세요.");
					continue;
				}
				int max = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					avg += scores[i];
				}
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+(avg/scores.length));
				
				
			}
			else if(selectNo == 5) {
				run = false;
			}
			else {
				System.out.println("잘못된 메뉴를 입력했습니다.");
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
