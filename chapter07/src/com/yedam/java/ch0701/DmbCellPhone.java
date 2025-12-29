package com.yedam.java.ch0701;
// 자식 클래스 : CellPhone(기존 클래스) + DMB
public class DmbCellPhone extends CellPhone {
	// extends(상속) : 부모 클래스의 멤버를 사용할 수 있음
	
	// 필드
	int channel;

	// 생성자
	public DmbCellPhone(String model, String color, int channel) {	
		super(model,color); // 부모 생성자 호출 => 무조건 첫 번째 줄

//		this.model = model;
//		this.color = color;
		this.channel = channel;
		System.out.println("DmbCellPhone 인스턴스 생성");
		System.out.println(System.identityHashCode(getClass()));
	}
	
	
	// 메소드
	void turnOnDmb () {
		System.out.println("채널 "+ this.channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+this.channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
