package day46_static;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		mom.takeASlice();
		
		System.out.println("Total slices: "+mom.pizzaSlices);
		System.out.println(Dinner.pizzaSlices);
	}

}
