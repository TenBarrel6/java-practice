package day23_loops_and_arreys;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//let's write a program 
		//that  will calculate a sum of 6 numbers 
		//if nubers is less or equals to 0, ignore this number
		//we need to ask user to provide a number 
		int num = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 6; i++) {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			if(num<=0) {
				continue;
			}
			sum+=num;
		}
		System.out.println("The sum is: "+sum);
	}

}
