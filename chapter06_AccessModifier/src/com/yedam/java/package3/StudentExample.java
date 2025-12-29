package com.yedam.java.package3;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		Scanner scanner = new Scanner(System.in);
		Student[] stds = null;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				stds = new Student[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					stds[i] = new Student();
					System.out.print("이름> ");
					String name = scanner.nextLine();
					stds[i].setName(name);
					System.out.print("\n국어 점수> ");
					stds[i].setKorean(Integer.parseInt(scanner.nextLine()));
					System.out.print("\n수학 점수> ");
					stds[i].setMath(Integer.parseInt(scanner.nextLine()));
					System.out.print("\n영어 점수> ");
					stds[i].setEnglish(Integer.parseInt(scanner.nextLine()));
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("=======================");
					System.out.println("이름 | 국어 | 수학 | 영어");
					stds[i].showInfo();
					System.out.println("=======================");
				}

			} else if (selectNo == 4) {
				/*
				 * 국어점수 중 최고점 받은 학생이름, 국어점수 수학점수 중 최고점 받은 학생이름, 수학점수 영어점수 중 최고점 받은 학생이름, 영어점수
				 */
				MaxScore korMax = new MaxScore(0, stds[0].getKorean());
				MaxScore mathMax = new MaxScore(0, stds[0].getMath());
				MaxScore engMax = new MaxScore(0, stds[0].getEnglish());

				for (int i = 0; i < studentNum; i++) {
					Student student = stds[i];
					if (korMax.getScore() < student.getKorean()) {
						korMax.setIdx(i);
					}
					if (mathMax.getScore() < student.getMath()) {
						mathMax.setIdx(i);
					}
					if (engMax.getScore() < student.getEnglish()) {
						engMax.setIdx(i);
					}
				}
				System.out.printf("국어 최고점을 받은 학생은 %s이고 점수는 %d\n", stds[korMax.getIdx()].getName(),
						stds[korMax.getIdx()].getKorean());
				System.out.printf("수학 최고점을 받은 학생은 %s이고 점수는 %d\n", stds[mathMax.getIdx()].getName(),
						stds[mathMax.getIdx()].getMath());
				System.out.printf("영어 최고점을 받은 학생은 %s이고 점수는 %d\n", stds[engMax.getIdx()].getName(),
						stds[engMax.getIdx()].getEnglish());
				
//				int korMax = 0;
//				String korName = "";
//				int mathMax = 0;
//				String mathName = "";
//				int enMax = 0;
//				String enName = "";
//				
//				for(int i=0; i< studentNum; i++) {
//					Student student = stds[i];
//					if(korMax < student.getKorean()) {
//						korMax = student.getKorean();
//						korName = student.getName();
//					}
//					if(mathMax < student.getMath()) {
//						mathMax = student.getMath();
//						mathName = student.getName();
//					}
//					if(enMax < student.getEnglish()) {
//						enMax = student.getEnglish();
//						enName = student.getName();
//					}
//				}
//				System.out.println(
//						"국어 최고 점수 : "+korMax +" 학생 이름 : "+korName +" | \n"+
//								"수학 최고 점수 : "+mathMax +" 학생 이름 : "+mathName +" | \n"+
//								"영어 최고 점수 : "+enMax +" 학생 이름 : "+enName +" | \n"
//						);

			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("메뉴를 잘 못 입력하셨습니다.");
			}

		}
		System.out.println("프로그램 종료");
		scanner.close();

	}
}
