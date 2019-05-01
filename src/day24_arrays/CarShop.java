package day24_arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Step create an aray of strings, and store this cars
		//
		String[] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
		for(String car:cars) {
//			if(!car.toLowerCase().startsWith("m")) {
//				System.out.println(car);
//			}else {
//				continue;
//			}
			
//			if(car.toLowerCase().contains("r")) {
//				System.out.println(car);
//			}else {
//				continue;
//			}
			
//			if(car.toLowerCase().endsWith("a")) {
//				System.out.println(car);
//			}else {
//				continue;
//			}
			
			if(car.length()>=6) {
				System.out.println(car);
			}		
			
		}
		
		String temp = cars[0];
		cars[0] = cars[cars.length-1];
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
		
	}

}
