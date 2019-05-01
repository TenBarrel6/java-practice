package day06_operators2;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int students = 45;
		System.out.println("Students: "+students);
	
		students=students+5;
		System.out.println("Students: "+students);
		
		students=students-2;
		System.out.println("Students: "+students);
		
		int teachers = 10;
		System.out.println("Teachers: "+ teachers);
		
		teachers+=2; // increase teachers by 2.
		System.out.println("Teachers: "+ teachers);
		
		//teachers = teachers -5;
		teachers -=5;
		System.out.println("Teachers: "+ teachers);
		
		int cars = 12;
		cars *=2; // u can use this one shorter way to right cars=cars*2;
		System.out.println("Cars: "+cars);
		
		cars += cars; //same thing like privious on but adding to int's
		System.out.println("Cars: "+cars);
		
		int shoes = 20;
		shoes /=4; // shoes = shoes / 4; shorter way to assign this action
		System.out.println("Shoes: "+shoes);
		
		double price = 45.50;
		int amount = 5;
		price +=amount; // it's called short hand operator
		System.out.println(price);
		
		int pennies = 550;
		pennies %=100; // pennies = pennies%100;
		System.out.println(pennies);
		
		int apples = 10;
		apples =-3; // this is not short hand IT'S REASSIGNING VALUE!!!
		System.out.println(apples);

		
		




	}

}
