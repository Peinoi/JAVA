package com.yedam.java.ch0701;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		// 자식 클래스 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone 클래스의 상속 필드
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);		
		
		
		// CellPhone 클래스로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요!");
		dmbCellPhone.receiveVoice("안녕하세요 !");
		dmbCellPhone.sendVoice("반갑습니다!");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
	
		
		// DmbCellPhone 필드
		System.out.println("채널 : "+ dmbCellPhone.channel);
		
		// DmbCellPhone 메소드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
