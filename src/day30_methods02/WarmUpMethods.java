package day30_methods02;

import java.util.Scanner;

public class WarmUpMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print5Stars();
		//call print5Stars 100 times
//		for(int i = 0; i<100; i++) {
//			print5Stars();
//		}
		introduce();
	}
	
	public static void print5Stars() {
		System.out.println("*****");
	}
	
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.next();
		System.out.println("Nice to meet you, "+name);
	}

}
