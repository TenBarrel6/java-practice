package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, What is your name?");
		String name = input.next(); // accept String input 
	
		System.out.println("Nice to meet you, "+name);

	}

}
