package day23_loops_and_arreys;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int itsPrime =0;
        int prime = scan.nextInt();
        for (int i = 1; i <= prime; i++ ) {
            if (prime%i == 0) {
                itsPrime++;
            }
        }
        if (itsPrime == 2) {
            System.out.println("It's prime number");
        } else {
            System.out.println("It's not prime number");
        }
	}

}
