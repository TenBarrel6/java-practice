package day36_wraperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//declare ArrayList called languages
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Arabic");
		languages.add("Russian");
		languages.add("Azerbaijani");
		languages.add("Ukrainian");
		
		System.out.println(languages.size());
		languages.add("Turkish");
		System.out.println(languages.size());
		
		//remove java
		languages.remove(0);
		System.out.println(languages.get(0));
		System.out.println(languages.toString());
	}
}
