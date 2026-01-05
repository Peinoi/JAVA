package com.yedam.java.chap1101.clazz;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {

		Class stringMeta = Class.forName("java.lang.String");
		System.out.println(stringMeta.getName());
		System.out.println(stringMeta.getPackageName());
		System.out.println(stringMeta.getSimpleName());
		System.out.println(stringMeta.getFields()[0]);
		System.out.println(stringMeta.getMethods()[0]);
		
	}

}
