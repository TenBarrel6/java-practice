package day20_for_loop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		if(num<1||num>10) {
			System.out.println("Invalid input");
			return;
		}
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" x "+i+" = "+num*i);
		}
		
	}

}
