package com.yedam.java.ch0801;

public class SmartTV implements RemoteControl, Searchable {

	// 필드
	private int volume;

	// 생성자
	// 메소드

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 전원을 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		// TLODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨" + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
