package day13_ternary_strings_intro;

import java.util.Scanner;

public class CarSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Which type of car are you interested in?");
		System.out.println(" 1)American \n 2)Japanese \n 3)German \n 4)Italian \n 5)Korean");
	
		int carType = scan.nextInt();
		String carOptions,carOrigin = null,report = null ;
		double averagePrice ;
		
		switch(carType) {
		case 1: averagePrice = 33000;
		carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
		carOrigin = "American";
		report = carOptions+"\nAverage Price: "+averagePrice;
		break;
		case 2: averagePrice = 32000;
		carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
		carOrigin = "Japanese";
		report = carOptions+"\nAverage Price: "+averagePrice;
		break;
		case 3: averagePrice = 55000;
		carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
		carOrigin = "German";
		report = carOptions+"\nAverage Price: "+averagePrice;
		break;
		case 4: averagePrice = 85000;
		carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
		carOrigin = "Italian";
		report = carOptions+"\nAverage Price: "+averagePrice;
		break;
		case 5: averagePrice = 25000;
		carOptions = "Kia, Hyundai, Daewoo";
		carOrigin = "Korean";
		report = carOptions+"\nAverage Price: "+averagePrice;
		break;
		default: System.out.println("Car type not available");
		return; // stop executing the code EVEN after switch. Doesn't run the rest!!!
		
		}
		System.out.println("You selected "+carOrigin+" car type and your options are\n"
		+report);

	}

}
