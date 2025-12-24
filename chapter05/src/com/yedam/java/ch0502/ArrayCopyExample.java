package com.yedam.java.ch0502;

public class ArrayCopyExample {
	public static void main(String[] args) {
		int[] first = {1,2,3};
		//배열복사
		// 1) 얕은 복사
		int[] second = first;
		second[1] =10;;
		System.out.println("first[1] : " +  first[1] ) ;
		System.out.println("secone[1] : " +  first[1] ) ;
		
		// 2) 깉은 복사
		int[] third = new int[3];
		for(int i=0; i< first.length; i++)
		{
			third[i] = first[i];
		}
		
		third[1] = 1234;
		System.out.println("first[1] : " + first[1]);
		System.out.println("third[1] : " + third[1]);
		
		
		
		int[] copyAry = new int[10];
		System.arraycopy(first, 0, copyAry, 5,2);
		
		//향상된 for문
		for(int val : copyAry) {
			System.out.print(val);
		}
	}
}
