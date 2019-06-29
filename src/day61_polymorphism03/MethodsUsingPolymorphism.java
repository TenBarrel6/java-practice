package day61_polymorphism03;

import day60_polymorphism02.*;
import java.util.*;

public class MethodsUsingPolymorphism {
	
	public static void purchase(AppleDevice apple) {
		System.out.println("Purchasing: "+apple.getClass().getSimpleName());
	}
	
	public static void giveMeAnyObject(Object object) {
		System.out.println("You gave me: "+object.getClass().getSimpleName());
	}
	
	public static AppleDevice buildAppleDevice(AppleDevice apple) {
		return apple;
	}
	
	public static AppleDevice buildDevice(String type) {
		
		return type.equals("ipad")?new Ipad():type.equals("mac")?new Mac():new AppleWatch();
	}
	public static void main(String[] args) {
		AppleDevice mac = new Mac();
		purchase(mac);
		AppleDevice watch = new AppleWatch();
		purchase(watch);
		
		purchase(new Ipad());
		
		giveMeAnyObject(new Mac());
		giveMeAnyObject(new Scanner(System.in));
		
		purchase(buildDevice("mac"));
		
	}
}
