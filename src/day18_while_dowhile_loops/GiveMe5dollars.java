package day18_while_dowhile_loops;

import java.util.Scanner;

public class GiveMe5dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dollars = 0;
		while (dollars !=5) {
			System.out.println("Give me 5$");
			dollars = scan.nextInt();
		}
		System.out.println("Thank you for 5$");
	}

}
