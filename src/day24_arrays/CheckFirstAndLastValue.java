package day24_arrays;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program that will print true
		//if first and ladt number is the same
		//if first and ladt value in the array of int's is same, print true
		int[] numbers = {12, 41, 213, 21, 42, 12};
		
		
		//.length <- it's not a method, it's a instance variable (property)
		boolean equals = numbers[0] == numbers[numbers.length-1];
		System.out.println(equals);
		System.out.println(numbers[0] == numbers[numbers.length-1]);
//		for(int i:numbers) {
//			if()
//		}
		
		System.out.println();
		char[] newChars = new char[3];
		System.out.println("Value of char: "+newChars[0]);
		System.out.println(newChars[0]+0);
	}

}
