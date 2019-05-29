package day37_arraylist;

import java.util.ArrayList;

public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Barnaul");
		cities.add("Dushanbe");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		
		for(String k : cities) {
			System.out.print(k+" ");
		}
	}

}
