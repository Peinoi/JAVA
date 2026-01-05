package com.yedam.java.chap1101.object;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj = new Object();
		Date date = new Date();
		Member member = new Member("홍");
		
		// toString 직접 호출
		System.out.println(obj.toString());
		System.out.println(date.toString());
		System.out.println(member.toString());
		
		System.out.println();
		
		// 내부에서 자동으로 호출
		System.out.println(obj);
		System.out.println(date);
		System.out.println(member);
		
	}
}
