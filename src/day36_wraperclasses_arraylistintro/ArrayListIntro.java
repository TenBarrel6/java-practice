package day36_wraperclasses_arraylistintro;
import java.util.*;
public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an arrayList
		
		ArrayList <String> names = new ArrayList<>();
		ArrayList <Integer> nums = new ArrayList<>();
		
		// how to assign values into array list
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		
		nums.add(123);
		nums.add(345345);
		nums.add(3246);
		nums.add(3454);
		nums.add(12277);
		
		//read from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		
		System.out.println(nums.size());
	}

}
