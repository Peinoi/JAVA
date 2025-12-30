package com.yedam.java.ch0801;

public class SmartTVExample {
	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV();
		smartTV.turnOn();
		smartTV.setVolume(10);
		smartTV.search("네이버");
		smartTV.turnOff();
		System.out.println("------------------");
		// SmartTV = RemoteControl + Searchable + 알파
		RemoteControl rc = smartTV; // Searchable + 알파는 접근 불가
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable search = smartTV; // RemoteControl + 알파는 접근 불가
		search.search("교보문고");
	}
}
