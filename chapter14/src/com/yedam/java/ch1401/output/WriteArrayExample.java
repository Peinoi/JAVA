package com.yedam.java.ch1401.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteArrayExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");

		byte[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		os.write(array);

		os.flush();
		os.close();
	}

}
