package com.yedam.java.package3;

public class Student {
	// 필드 => private, 외부에서 접근 불가
	private String name;
	private int korean;
	private int english;
	private int math;

	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return this.korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return this.english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return this.math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	public void showInfo() {
		String info = this.name + " | "+
				this.korean + " | " +
				this.math + " | "+
				this.english;
		System.out.println(info);
	}
	
	
	
}
