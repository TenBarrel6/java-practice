package day24_arrays;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] product = {"Timberland Shoes", "H&M Shirt", "Swatch Watch", 
				"Gucci bag", "Adidas Socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemId = {23423, 235234578, 76867876, 67867, 4646};
		//print the count of products
		System.out.println("Products count: "+product.length);
		
		//check if products, prices and itemsId have same count
		if(product.length==prices.length && product.length==itemId.length) {
			System.out.println("Shoping list is looks good");
		}else {
			System.out.println("Something is wrong with the list");
		}
		
		//loop trough product and print each one in separate line
		
		for(String prod:product) {
			System.out.println(prod);
		}
		
		//prices --> for loop
		System.out.println();
		for(int i = 0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		System.out.println();
		for(int i = itemId.length-1; i>=0; i--) {
			System.out.println(itemId[i]);
		}
		
		//print a report. with a total price
		//item 1: 12345 - Timberlend Shoes - $1222
		//....
		//Total price:
		System.out.println();
		System.out.println("Your shopping receipt:");
		for(int i = 0; i<itemId.length; i++) {
			System.out.println("Item "+(i+1)+": "+itemId[i]+" - "+product[i]+" - $"+prices[i]);
		}
		int total = 0;
		for(int i = 0; i<prices.length; i++) {
			total += prices[i];
		}
		System.out.println("Total price: "+total);
		
		int maxIndex = 0;
		double maxPrice = 0;
		for(int j = 0; j < prices.length; j++) {
			if(prices[j]>maxPrice) {
				maxPrice = prices[j];
				maxIndex = j;
			}
		}
		System.out.println(itemId[maxIndex]+" - "+product[maxIndex]+" - $"+maxPrice);
	}
}
