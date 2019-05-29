package day42_customclasses_encapsulation;
import java.util.*;
public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger bur1 = new Burger();
		bur1.name = "EL MATADOR";
		String[] ings = {"onion", "cheese", "pickless", "lettuce", "b7 sauce"};
		bur1.ingridients = ings;
		
		System.out.println(bur1.name);
		System.out.println(Arrays.toString(bur1.ingridients));
		System.out.println(bur1.ingridients[0]);
		for(String ing:bur1.ingridients) {
			System.out.println(ing);
		}
	}

}
