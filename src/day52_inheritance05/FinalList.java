package day52_inheritance05;

import java.util.*;

public class FinalList {
	public static void main(String[] args) {
		final ArrayList<String> COLORS = new ArrayList<String>(
				Arrays.asList("Orange",
						"Gray",
						"White",
						"Blue"));
		System.out.println(COLORS.toString());
		COLORS.add("Black");
		System.out.println(COLORS.toString());
		
		//COLORS = new ArrayList<String>();// new object
		System.out.println(COLORS.toString());
		COLORS.add("Yellow");
		System.out.println(COLORS.toString());
		
	}
}
