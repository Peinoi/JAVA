package com.yedam.java.ch0703;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone p = new Phone("홍");
		
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}
