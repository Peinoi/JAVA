package com.yedam.java.chap1101.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();

		// 기본 문자셋(Chacter str)으로 인코딩과 디코딩
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {
			// EUC-KR : 한글, 2byte로 표현
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			// UTF-8 : 유니코드 => 표준
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3);
			System.out.println("bytes3->String: " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
