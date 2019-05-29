package day36_wraperclasses_arraylistintro;
import java.util.*;
public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an arrayList
		
		ArrayList <String> names = new ArrayList<>();
		ArrayList <Integer> nums = new ArrayList<>();
		
		// how to assign values into array list
		
//		names.add("Roman");
//		names.add("Orhan");
//		names.add("Vlad");
//		names.add("Olimjon");
//		names.add("Natalia");
//		
//		nums.add(123);
//		nums.add(345345);
//		nums.add(3246);
//		nums.add(3454);
//		nums.add(12277);
//		
//		//read from ArrayList
//		
//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		
//		System.out.println(nums.get(0));
//		System.out.println(nums.get(1));
//		
//		System.out.println(nums.size());
		String[] order = {"dog", "cactus", "cactus", "cactus", "cactus", "coffee mug", "fork", "fork", "fork"}; boolean isMember = true;
		String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
		
		int count = 0;
		ArrayList<String> buy3Disc = new ArrayList<>();
		for(int i = 0; i<order.length; i++) {
			buy3Disc.add(order[i]);
		}
		for(int i = 0; i<SPECIAL_ITEMS.length; i++) {
			count = 0;
			for(int j = 0; j<order.length; j++) {
				if(SPECIAL_ITEMS[i].equalsIgnoreCase(order[j])) {
					count++;
				}
			}
			System.out.println(count);
			if(count>=3 && isMember) {
				buy3Disc.add(SPECIAL_ITEMS[i].toLowerCase());
				buy3Disc.add(SPECIAL_ITEMS[i].toLowerCase());
			}else if(count>=3 && !isMember) {
				buy3Disc.add(SPECIAL_ITEMS[i].toLowerCase());
			}
		}
	    System.out.println(buy3Disc);
	    String[] newOrderArr = new String[buy3Disc.size()];
		for(int i = 0; i<newOrderArr.length; i++) {
			newOrderArr[i] = buy3Disc.get(i);
		}
		System.out.println(Arrays.toString(newOrderArr));
	}

}
