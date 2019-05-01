package day11_logical_nestedif;

import java.util.Scanner;

public class TollCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Toll road calculator");
		System.out.println("To continue press: Y");
		System.out.println("To exit the program press: N");
		String continues = scan.next().toUpperCase();
		
		if(continues.equals("Y")) {
			System.out.println();
			System.out.println("**********************");
			System.out.println("Enter your car type:");
			System.out.println("1) Passanger;");
			System.out.println("2) Truck.");
			int carType = scan.nextInt();
			System.out.println("Is it the rush hour: Y/N?");
			String isRushHour = scan.next().toUpperCase();
			
			if (carType==1&&isRushHour.equals("Y")) {
				System.out.println("Your price is $4.00");
			}else if(carType==1&&isRushHour.equals("N")) {
				System.out.println("Your price is $2.00");
			}else if(carType==2&&isRushHour.equals("Y")) {
				System.out.println("Your price is $6.00");
			}else if(carType==2&&isRushHour.equals("N")) {
				System.out.println("Your price is $12.00");
			}else {
				System.out.println("Not valid input!");
			}
			System.out.println("**********************");
			System.out.println();
		}else if(continues.equals("N")) {
			System.out.println("Thank you for using our application!");
		}
	
	}
			

}


