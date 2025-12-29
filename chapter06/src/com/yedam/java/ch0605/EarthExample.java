package com.yedam.java.ch0605;

public class EarthExample {
	public static void main(String[] args) {
		// Earth.EARTH_AREA = 0;
		// Earth.EARTH_RADIUS = 0;
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적: " + Earth.EARTH_AREA + "km^2");

		Earth earth = new Earth("지구");
		System.out.println(earth.name);

	}
}
