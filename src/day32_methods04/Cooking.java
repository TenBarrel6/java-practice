package day32_methods04;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makePancakes();
		makePasta();
		cook("Omelette", "Eggs, Salt, Tomatoes, Onions, Beacon");
	}
	
	public static void cook(String dish, String ingridients) {
		System.out.println("~~"+dish.toUpperCase()+" RECIPE~~");
		add(ingridients);
		System.out.println("Cook it until it's cooked");
		System.out.println("~~ "+dish.toUpperCase()+" IS READY! ~~");
		
	}
	
	public static void makePancakes() {
		System.out.println("~~ PANCAKES RECIPE~~ ");
		add("Milk, Egss, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
		
	}
	
	public static void makePasta() {
		System.out.println("~~ITALIAN PASTA RECIPE");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~ DELICIOUS PASTA IS READY ~~");
	}
	
	public static void add(String addProd) {
		System.out.println("Add "+addProd);
	}
	
	public static void mix(int sec) {
		System.out.println("Mix for "+sec+" seconds");
	}
	
	public static void fry(int minutes) {
		System.out.println("Fry for "+minutes+" minutes");
	}
	
	public static void boil(int minutes) {
		System.out.println("Boil for "+minutes+" minutes");
	}

}
