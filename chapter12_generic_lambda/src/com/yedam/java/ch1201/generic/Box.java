package com.yedam.java.ch1201.generic;

//
public class Box<T> {
	private T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return this.content;
	}
}
