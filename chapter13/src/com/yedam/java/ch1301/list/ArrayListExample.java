package com.yedam.java.ch1301.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// 객체 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		System.out.println(list);

		// 객체 수정
		list.set(0, "자바");

		// 크기
		int size = list.size();
		System.out.println("총 개체 수 : " + size);

		// 조회
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.printf("%d : %s\n", i, str);
		}
		System.out.println();


		// 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.printf("%d : %s\n", i, str);
		}
		
		System.out.println();
		
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println();
		
		

	}
}
