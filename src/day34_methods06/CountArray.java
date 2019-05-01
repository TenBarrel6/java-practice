package day34_methods06;

public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] j = {4, 5, 6, 7, 4, 5, 4, 3};
		System.out.println(findOccurences(j,  4));
	}
	
	public static int findOccurences(int[] arr, int val) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==val) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] getArray() {
		int[] retArray = {45, 567, 45, 23, 243, 1000};
		return retArray;
	}
	

}
