package com.yedam.java.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream us = new FileInputStream("c:/Temp/test1.db");
		
		
		while (true) {
			int data = us.read();
			if (data == -1) {
				break;
			}
			System.out.println(data);

		}
		us.close();
	}
}
