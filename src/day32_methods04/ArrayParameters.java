package day32_methods04;

import java.util.Arrays;

public class ArrayParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {4, 4, 5, 6, 7, 8};
		printArray(myArr);
		printArray(new int[] {34,4,45,454,34,5,4,5,4,54,6});
		int[] arr1 = {34,34,34543,545,645,7324,2234,23};
		int[] arr2 = {45,656,56,56,56,5,6565,423};
		print2Arrays(arr2, arr1);
	}
	
	/*
	 * Method: printArray
	 * return type: void
	 * param: int[] nums
	 * prints values of the nums array 
	 * 
	 */
	
	public static void printArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
		for(int n : nums) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void print2Arrays(int[] num1, int[] num2) {
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}
}
