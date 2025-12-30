package com.yedam.java.ch0702.field;

// 부모 클래스
public class Tire {

	// 필드
	public int maxRotation; // 최대 회전수(수명)
	public int accumulatedRotation; // 누적 회전수
	public String location; // 타이어 위치
	// 생성자
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	// 메소드
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			// 현재 누적회전수가 최대회전수보다 작을 경우 정상 주행
			System.out.println(location + " Tire 수명 : "
					+ (maxRotation - accumulatedRotation)
					+ "회");
			return true;
		}else {
			// 현재 누적회전수가 최대회전수를 초과한 경우 펑크
			System.out.println("***"+location + " Tire 펑크 ***");
			return false;
		}
	}
}
