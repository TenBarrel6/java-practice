package day61_polymorphism03;

import day60_polymorphism02.*;

public class DownCasting {
	public static void main(String[] args) {
		AppleDevice dev2 = new Mac();
		
		//1) using another reference variable
		Mac mac = (Mac)dev2;
		mac.code();
		
		//2) casting and call in single statement
		((Mac)dev2).code();
		
		//String str = (String) dev2; not related with inheritance
		double d = 123.45;
		int j = (int)d;
		System.out.println(j);
	}
}
