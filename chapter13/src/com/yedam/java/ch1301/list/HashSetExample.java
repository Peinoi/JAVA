package com.yedam.java.ch1301.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATS");

		// 크기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);

		// 반복자를 활용해 데이터 확인
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String skill = iterator.next();
			System.out.println("\t" + skill);
		}

		// 객체 제거
		set.remove("JDBC");
		set.remove("iBATS");

		System.out.println();

		for (String string : set) {
			System.out.println("\t" + string);
		}
	}
}
