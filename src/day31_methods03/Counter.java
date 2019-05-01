package day31_methods03;
import java.util.*;
public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n = scan.nextInt();
//		countUp(n);
//		countDown(n);
		System.out.println("enter the car name and speed");
		String car = scan.next();
		int speed = scan.nextInt();
		drive(car, speed);
	}
	
	public static void countUp(int n) {
		if(n==0) {
			System.out.println("invalid input");
		}
		for(int i = 1; i<= n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void countDown(int n) {
		
		for(int i = n; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void drive(String car, int speed) {
		System.out.println(car+" is driving "+speed+" mph");
		
	}

}
