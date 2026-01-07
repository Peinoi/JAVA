package com.yedam.java.ch1301.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		long startTime; // 시작 시간
		long endTime; // 종료 시간

		List<String> list1 = new ArrayList<String>();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();

		System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime) + " ns");

		List<String> list2 = new LinkedList<String>();
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();

		System.out.println("LinkedList 걸린 시간 : " + (endTime - startTime) + " ns");

	}
}
