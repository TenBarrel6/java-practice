package day37_arraylist;

import java.util.*;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums);
		
		List<Double> prices = Arrays.asList(12.4, 5.3, 500.0, 1230.50, 5.99, 
				12.0, 9874.44, 34.4, 123.5, 7.4);
		double total = 0;
		for(double price : prices) {
			total+=price;
		}
		System.out.println(total);
	}

}
