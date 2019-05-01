package day34_methods06;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWords("asdf", "kurva", "mazafaka", "pidor", "loh");
		
		System.out.println("*************************");
		int[] sumA = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(sum(sumA));
		System.out.println("*************************");
		cook("Burito bowl", "rice", "cucmbers", "fingers of cat", "coakroaches");
		
	}
	
	public static void printWords(String...words) {
		System.out.println(Arrays.toString(words));
		// or
		for(String word : words) {
			System.out.println(word);
		}
	}
	
	public static int sum(int... nums) {
		int sumIs = 0;
		for(int num:nums) {
			sumIs+=num;
		}
		return sumIs;
	}
	
	public static void cook(String name, String... ings) {
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
	}

}
