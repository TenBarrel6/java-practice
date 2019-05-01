package day19_loops;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double balance;
		double transaction;
		byte count = 0;
		System.out.println("Please enter your current balance:");
		balance = scan.nextDouble();
		while(balance>0) {
			count++;
			System.out.println("-----------------------------------");
			System.out.println("Please enter your transaction amount:");
			transaction = scan.nextDouble();
			balance -= transaction;
			System.out.println("Your balance after #"+count+" transaction is: "+balance);
			if(transaction>balance) {
				System.out.println("Your balance is about to be negative due to this transaction!");
			}
			if(balance==0) {
				System.out.println("You have no funds for other transactions,"
						+ "\nyour balance is: "+balance);
			}
		}
	}

}
