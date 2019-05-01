package day27_array05;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first time please:");
		int[] time1 = {scan.nextInt(), scan.nextInt()};
		System.out.println("Enter second time please:");
		int[] time2 = {scan.nextInt(), scan.nextInt()};
		
		//valid hour/minute
		if(time1[0] < 0 || time1[0] > 23){
			System.out.println("Time1 invalid hours");
			return;
		}
		
		if(time1[1] < 0 || time1[1] > 59){
			System.out.println("Time1 invalid minutes");
			return;
		}
		
		if(time2[0] < 0 || time2[0] > 23){
			System.out.println("Time2 invalid hours");
			return;
		}
		
		if(time2[1] < 0 || time2[1] > 59){
			System.out.println("Time2 invalid minutes");
			return;
		}
		
		if(time1[0]>time2[0]) {
			System.out.println("Time2 is earlier");
		}else if(time2[0]>time1[0]) {
			System.out.println("Time1 is earlier");
		}else {
			if(time1[1]>time2[1]) {
				System.out.println("Time2 is earlier");
			}else if(time2[1]>time1[1]) {
				System.out.println("Time1 is earlier");
			}else if(time2[1]==time1[1]) {
				System.out.println("Equal time!");
			}
		}
	}

}
