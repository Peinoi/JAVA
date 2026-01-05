package com.yedam.java.chap1101.object;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	// 동일한 아이디를 가질 경우 '같다'로 결ㅊ정
	// 참조타입을 동등 비교(==)하는 경우 메모리 주소를 비교
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (member.id.equals(this.id)) {
				return true;
			}
		}
		return false;

	}

	// Map의 Key로 설정하기 위해 추가
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public String toString() { 
		// 직렬화(Serialize, 객체를 문장으로 변화) 메서드
		return "Member - id : " + this.id;
	}

}
