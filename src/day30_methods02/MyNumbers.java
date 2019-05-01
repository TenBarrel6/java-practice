package day30_methods02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		showMe5Numbers();
//		do10PushUps();
		rangePrint();
	}
	
	public static void showMe5Numbers() {
		Random rand = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(1001);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void do10PushUps() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup - "+i);
		}
		System.out.println("Time to rest!");
	}
	
	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int frst = scan.nextInt();
		int scnd = scan.nextInt();
		if(frst<scnd) {
			for (int i = frst; i <= scnd; i++) {
				System.out.print(i+" ");
			}
		}else {
			for (int i = scnd; i <= frst; i++) {
				System.out.print(i+" ");
			}
		}
		
	}

}
