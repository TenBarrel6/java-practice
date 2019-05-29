package day40_customclasses_methods;
import java.util.*;
public class WarmUpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("apple");
		arr.add("tomato");
		arr.add("apple");
		String word = "apple";
		System.out.println(countOccurences(arr, word));
	}
	
	public static int countOccurences(ArrayList<String> arr, String word) {
		int counter = 0;
		for(int i = 0; i<arr.size(); i++) {
			if(arr.get(i).equals(word)) {
				counter++;
			}
		}
		return counter;
	}
	

}
