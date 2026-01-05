package com.yedam.java.chap1002;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	public static void findClass() throws ClassNotFoundException, NullPointerException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
