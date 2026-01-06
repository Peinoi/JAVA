package com.yedam.java.ch1201.generic;

public class Util {
	public <T> T plus(T x, T y) {
		return x;
	}

	public static <A> Box<A> boxing(A a) {
		Box<A> box = new Box<>();
		box.setContent(a);
		return box;
	}
}
