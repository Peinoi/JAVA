package com.yedam.java.ch1301.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		int score = map.get("홍길동");
		System.out.println("\t 홍길동 : " + score);
		System.out.println();

		// 전체 순환
		// 1) keySet
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		while (keyInterator.hasNext()) {
			String key = keyInterator.next();
			int value = map.get(key);
			System.out.printf("\t%s : %d\n", key, value);
		}

		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		// 2) entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.printf("\t%s : %d\n", key, value);
		}
		
		System.out.println();
	}
}
