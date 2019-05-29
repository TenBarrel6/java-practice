package day38_arraylist02;

import java.util.*;

public class ColletctionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numsList = new ArrayList<>();
		numsList.add(123);
		numsList.add(456);
		numsList.add(3466);
		numsList.add(1);
		numsList.add(239);
		numsList.add(4);
		System.out.println(numsList);
		
		System.out.println("Sorting...");
		Collections.sort(numsList);
		System.out.println(numsList);
		System.out.println("******************");
		List<String> strList = new ArrayList<>();
		strList.add("asdf");
		strList.add("Diana");
		strList.add("Bojan");
		strList.add("Alex");
		System.out.println(strList);
		System.out.println("Sorting...");
		Collections.sort(strList);
		System.out.println(strList);
		
		// MAX, MIN
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);
		
		System.out.println(maxNum+" max");
		System.out.println(minNum+" min");
		
		Collections.shuffle(strList);
		System.out.println(strList);
		
	}

}
