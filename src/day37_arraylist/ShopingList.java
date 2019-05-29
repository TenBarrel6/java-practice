package day37_arraylist;

import java.util.ArrayList;

public class ShopingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> shopingList= new ArrayList<>();
		
		shopingList.add("bananas");
		shopingList.add("tomatoes");
		shopingList.add("mangoes");
		shopingList.add("lemons");
		shopingList.add("potatoes");
		shopingList.add("cucumbers");
		
		int count = shopingList.size();
		System.out.println("total: "+count);
		System.out.println("Shoping list: "+shopingList);
		
		shopingList.remove(0);
		shopingList.remove("lemons");
		System.out.println(shopingList.get(0));
		System.out.println(shopingList);
		
	}

}
