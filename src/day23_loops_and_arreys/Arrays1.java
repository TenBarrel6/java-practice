package day23_loops_and_arreys;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = new int[3];
//		int num1 = 5;
//		int num2 = 7;
//		int num3 = 10;
//		
//		numbers[0] = num1;
//		numbers[1] = num2;
//		numbers[2] = num3;
//		System.out.println(numbers[0]);
//		
//		int[] numbers2 = {1, 2, 10, 34};
//		System.out.println(numbers2[3]);
		
		String[] cars = { "volvo", "bmw", "mercedes", "mazda", "audi"};
		System.out.println(cars[0]+", "+cars[1]+", "+cars[2]+", "+cars[3]+", "+cars[4]);
		
		double[] price = {12.3,44.46,234.34,44.9787	};
		System.out.println(price[3]);
		
		String[]fruits = new String[] {"apples", "oranges", "bananas"};
		for(String fruit: fruits) {
			System.out.println(fruits);
		}
		
	}
}
