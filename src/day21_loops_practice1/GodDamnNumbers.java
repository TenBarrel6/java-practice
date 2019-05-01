package day21_loops_practice1;

import java.util.Scanner;

public class GodDamnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int first;
		int second;
		int i;
		do {
			System.out.println("Enter first number");
			first = scan.nextInt();
			System.out.println("Enter second number");
			second = scan.nextInt();
			i = first+second;
			if(i<=100) {
				System.out.println();
				System.out.println("***Try one more time ***");
			}
		}while(i<=100);
		System.out.println("Good numbers");
	}

}
