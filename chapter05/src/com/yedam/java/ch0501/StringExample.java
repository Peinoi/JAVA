package com.yedam.java.ch0501;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "신용권";
		String str2 = "신용권";
		
		str2 = "이것이 자바다.";
//		str2 = "신용권";
		System.out.println("str1 memory : " +System.identityHashCode(str1));
		System.out.println("str2 memory: " +System.identityHashCode(str2));
		System.out.println("str1 : " +str1);
		System.out.println("str2 : " +str2);
		
		int[] ary1 = {1,2,3};
		int[] ary2 = ary1;
		ary2[1] = 10;
		System.out.println("ary1 memory : " +System.identityHashCode(ary1));
		System.out.println("ary2 memory: " +System.identityHashCode(ary2));
		System.out.println("ary1 : " +ary1[1]);
		System.out.println("ary2 : " +ary2[0]);
		
		int[] third = ary2;
		System.out.println(third.length);
		
		String strA = new String("신용권");
		String strB = new String("신용권");
		System.out.println("strA memory : " +System.identityHashCode(strA));
		System.out.println("strB memory: " +System.identityHashCode(strB));
		System.out.println("strA : " +strA);
		System.out.println("strB : " +strB);
		
		if(strA == strB) {
			System.out.println("해당 객체들은 같은 객체입니다.");
		}
		else {
			System.out.println("해당 객체들은 서로 다른 객체 입니다.");
		}
		
		
		if(strA.equals(strB)) {
			System.out.println("해당 객체들은 같은 객체입니다.");
		}
		else {
			System.out.println("해당 객체들은 서로 다른 객체 입니다.");
		}
	}
}
