package day52_inheritance05;

import java.util.Arrays;

public class FinalArrays {
	public static void main(String[] args) {
		final int[] TEAMS = {11, 11};
		System.out.println("team1: "+TEAMS[0]);
		System.out.println("team2: "+TEAMS[1]);
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		System.out.println("team1: "+TEAMS[0]);
		System.out.println("team2: "+TEAMS[1]);
		
		//TEAMS = new int[3]; You cannot create a brand new object from this Arr
		
		int[] nums = new int[] {3, 4, 2};
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {345,2335,23,121};
		System.out.println(Arrays.toString(nums));
		
		final int[] finalNums = {23, 46, 12, 98};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 2345;
		System.out.println(Arrays.toString(finalNums));
	}
}
