package com.yedam.java.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadArrayExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test3.db");

		byte[] buffer  = new byte[4];

		while (true) {
//			buffer = new byte[4];
			int readByteNum = is.read(buffer);
			if (readByteNum == -1)
				break;
			for (byte b : buffer) {
				System.out.printf("%d ", b);
			}
			System.out.println();
		}
		is.close();
	}
}
