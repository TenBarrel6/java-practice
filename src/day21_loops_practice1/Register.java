package day21_loops_practice1;

import java.util.Scanner;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String item;
		double price;
		int counter;
		String totalItems = "";
		double totalPrice = 0;
		System.out.println("How many items are you purchasing?");
		counter = scan.nextInt();
		for(int i = 1; i<=counter; i++) {
			System.out.println("What is item "+i+"?");
			item = scan.next();
			System.out.println("How much is "+item+"?");
			price = scan.nextDouble();
			totalItems +=", "+item;
			totalPrice += price;
		}
		System.out.println("Your items: "+totalItems.replaceFirst(", ", ""));
		System.out.println("Your total Price: $"+totalPrice);
		
	}

}
