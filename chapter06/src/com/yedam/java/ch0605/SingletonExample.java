package com.yedam.java.ch0605;
import com.yedam.java.ch0605.Car;
public class SingletonExample {
	public static void main(String[] args) {
//		SingleTon obj1 = new SingleTon();
		SingleTon obj1 = SingleTon.getInstance();
		SingleTon obj2 = SingleTon.getInstance();
		//SingleTon.getInstance();
				
		if(obj1 == obj2 ) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		Car myCar = new Car();
		com.yedam.java.ch0605.Car newCar =
				new com.yedam.java.ch0605.Car();

	}
}
