package day07_scanner_operators;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice;
	    
	    System.out.println("Enter Item1 and its price:");
	    
	    item1 = scan.next();
	    price1 = scan.nextDouble();
	    
	    System.out.println("Enter Item2 and its price:");
	    
	    item2 = scan.next();
	    price2 = scan.nextDouble();
	    
	    System.out.println("Enter Item3 and its price:");
	    
	    item3 = scan.next();
	    price3 = scan.nextDouble();
	    
	    totalPrice = price1+price2+price3;
	    report = "Item1: "+item1+"Price: "+price1+", Item2: "+item2+"Price: "+price2+", Item3: "+item3+"Price: "+price3;
	    
	    System.out.println(report);
	    System.out.println("Total price: "+totalPrice);
		

	}

}
