package day34_methods06;

import java.util.*;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(CountArray.getArray()));
		System.out.println(Arrays.toString(getRandomArray(0)));
	}
	
	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];
		Random rand = new Random();
		for(int i = 0; i<size; i++) {
			arr[i] = rand.nextInt(100);
		}
		return arr;
	}

}
