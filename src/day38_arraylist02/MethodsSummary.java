package day38_arraylist02;

import java.util.*;

public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("grey");
		list.add("black");
		System.out.println(list);
		//add method with index: "yellow will be placed to index 0"
		list.add(0, "yellow");
		//to string method to print all values in same line
		System.out.println(list.toString());
		//size method - return number of values
		System.out.println(list.size()+" - list size");
		//get method - return value from index
		System.out.println(list.get(4)+" at index 4");
		//remove using index.removes value from index position
		list.remove(0); // removes yellow
		System.out.println(list);
		//remove usting value/element. removed element first occurrence
		list.remove("blue");
		System.out.println(list);
		//set(index, value) replace certain index with new value
		list.set(0, "orange");
		System.out.println(list);
		//indexOf(value) returns index of value in the list
		System.out.println("grey: "+list.indexOf("grey"));
		System.out.println("grin: "+list.indexOf("grin"));
		//isEmpty - returns true if list is empty. size == 0
		System.out.println("is list empty? - "+list.isEmpty());
		System.out.println("is list empty? - "+(list.size()==0));
		//contains(elem) - returns true if value is present
		System.out.println("white in list? - "+list.contains("white"));
		
		
		List<String> list2 = new ArrayList<String>();
		// addAll -> adds all values from one list into another
		list2.addAll(list);
		System.out.println(list2);
		//containsAll -> check if list has all values of another list
		System.out.println(list.containsAll(list2));
		//equals -> checks if two list are exactly equal
		System.out.println(list.equals(list2)+" -> lists equals");
		
		list2.add("pink");
		//removeAll() -> removes all matching values from your list that are in other
		list2.removeAll(list);
		System.out.println(list2+" after remove all");
		
		//addAll() -> adds a new list values starting from given index
		list2.addAll(0, list);
		System.out.println(list2);
		//cleat() -> clears a list, removes all values
		list.clear();
		list2.clear();
		
		System.out.println("both empty? - "+(list.isEmpty()&&list2.isEmpty()));
		
	}

}
