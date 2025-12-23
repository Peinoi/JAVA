package com.yedam.java.ch0401;

public class WhileExample {

	public static void main(String[] args) {
		//While 1) 횟수제한 없이 조건에 따라 반복 2) 무한루프 활용
		// 정수 1~ 10까지 출력
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		i=1;
		while(true) {
			if(i>10) {
				break;
			}
			System.out.println(i);
			i++;
		}
		i=13;
		do {
			i++;
			System.out.println(i);
		}
		while(i<10);
			
	}

}
