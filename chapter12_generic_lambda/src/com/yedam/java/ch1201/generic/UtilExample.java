package com.yedam.java.ch1201.generic;

public class UtilExample {
	public static void main(String[] args) {
		Util util = new Util();
		int result = util.plus(100, 200);
		System.out.println(result);
		double sum = util.plus(1.1, 15.3);
		System.out.println(sum);

		Box<String> name = Util.boxing("홍길동");
		System.out.println(name.getContent());
		
	}
}
