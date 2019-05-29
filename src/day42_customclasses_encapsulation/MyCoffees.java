package day42_customclasses_encapsulation;

public class MyCoffees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee co1 = new Coffee();
		co1.name = "iced caramel macchiato";
		co1.size = "grande";
		co1.price = 4.75;
		co1.calories = "250";
		co1.getCoffeInfo();
		
		Coffee co2 = new Coffee();
		co2.setName("java chip");
		co2.size = "venti";
		co2.price = 5.95;
		co2.calories = "600";
		co2.getCoffeInfo();
		
		Coffee co3 = new Coffee();
	}

}
