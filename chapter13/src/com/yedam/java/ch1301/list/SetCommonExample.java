package com.yedam.java.ch1301.list;

import java.util.HashSet;
import java.util.Set;

public class SetCommonExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// 객체 추가
		set.add("홍길동");
		set.add("강호동");
		set.add("강호동");

		// 크기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);

		
	}
}
