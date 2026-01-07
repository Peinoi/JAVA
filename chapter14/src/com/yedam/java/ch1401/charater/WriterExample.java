package com.yedam.java.ch1401.charater;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test3.txt");

		String message = "Hello, World!!\n오늘은 수요일!";
		writer.write(message);
		writer.close();

	}
}
