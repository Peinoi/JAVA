package com.yedam.java.ch0801;

public interface RemoteControl {
	//상수
	
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // 별도 final static 키워드가 상관 없음
	
	
	// 추상 메소드 -> 객체의 사용방법을 정의
	public abstract void turnOn();
	public void turnOff(); // 별도 abstract 키워드가 필요 없음
	public void setVolume(int volume);
	
	
	
	}
