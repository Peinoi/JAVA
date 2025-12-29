package com.yedam.java.ch0604;

public class MemberService {
	String id;
	String password;
	public MemberService(){
		this.id = "hong";
		this.password = "12345";
	}
	boolean login(String id, String password) {
		boolean isSuccesed = false;
		if(this.id.equals(id) && this.password.equals(password)) {			
			isSuccesed = true;
		}
		return isSuccesed;
		//리턴이 여러번 들아가는 경우는 거의 없다.
	}
	void logout(String id) {
		if(this.id.equals(id) ) {			
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
