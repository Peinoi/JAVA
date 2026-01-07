package com.yedam.java.ch1401.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);
		
		// flush 스트림안에 남아있는 데이터가 없도록 밀어 넣는다.
		os.flush(); 
		
		os.close();

	}
}
