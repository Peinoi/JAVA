package com.yedam.java.ch1401.charater;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonExample {
	public static void main(String[] args) {
		List<Integer> numer = Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10);
		// Stream Api : 컬렉션, 배열 등의 데이터 소스로부터 데이터를 받아와서
		// 원하는 형태로 가공하거나, 필터링 할 수 있는 기능을 제공
		
		List<Integer> evenNumbers = numer.stream() // 1) stream을 연다.
				.filter(n -> n % 2 == 0) // 2) 중간 연산은 여러개를 순차적으로 진행
//				.map(Math::max); // 이렇게 다중 중간 연산도 가능하며 맥스 부분은 짝수로 반환된 값중 최대값 하나만 반환
				.collect(Collectors.toList()); // 3) 최종연산 반환하는 형태를 결정 toList뿐만아니라 toSet등 다양하게 반환 가능
		
		// 람다식 중 메소드 참조 
		evenNumbers.stream().forEach(System.out::println);
		// :: 메소드 정보를 전달 하기 위해 사용 
		
		//풀어쓴 버전
		evenNumbers.stream().forEach(n -> System.out.println(n));
		
	}
}
