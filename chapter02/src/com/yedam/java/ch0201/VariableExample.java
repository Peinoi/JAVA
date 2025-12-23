package com.yedam.java.ch0201;

public class VariableExample {

	public static void main(String[] args) {		
//		변수 선언 및 사용
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 "+minute + "분 ");
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 "+ totalMinute + "분");
		
//		변수 사용(유효)범위 <=> 스코프(scope) : Java) 블록 단위
		
		int v1 =15;
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;
		
		
		
	}

}


























