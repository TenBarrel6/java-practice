package day42_customclasses_encapsulation;
import java.util.*;
public class StarBucks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();
		Coffee[] coffeeArr = new Coffee[2];
		coffeeArr[0] = new Coffee();
		coffeeArr[0].setCoffeeInfo("espresso", "tall", 2.55, "7");
		coffeeArr[0].getCoffeInfo();
		//create a single object first
		Coffee latte = new Coffee();
		// assign data
		latte.setCoffeeInfo("latte", "tall", 5.34, "250");
		coffeeArr[1] = latte;
		coffeeArr[1].getCoffeInfo();
	}

}
