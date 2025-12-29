package com.yedam.java.ch0604;

public class MainExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		// .(dot) :객체 접근 연산자
		cal.powerOn();
		
		//더하기
		int result1 = cal.plus(5, 6);
		System.out.println("result1:"+ result1);
		

		
		//나누기
		byte x = 10;
		byte y= 4;
		double result2 = cal.divid(x,y);
		System.out.println("result2 : "+result2);
		
		// 여러값 더하기
		int[] datas = {1,2,3,4,5};
		int result3 = cal.plus(datas);
		System.out.println("result3 : "+result3);
		
		datas = new int[] {1,10,5};
		result3 = cal.plus(datas);
		System.out.println("result3 : "+result3);
		
		
		int result4 = cal.minus(10,5,3);
		System.out.println("result4 : "+result4);
		result4 = cal.minus(1,4,2,6,7);
		System.out.println("result4 : "+result4);
		cal.powerOff();
		
		
	}
}
