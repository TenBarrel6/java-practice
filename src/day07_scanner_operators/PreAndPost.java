package day07_scanner_operators;

public class PreAndPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num2 = num++;
		System.out.println(num);
		System.out.println(num2);
		
		
		int n = 0;
		int n2 = ++n;
		System.out.println(n);
		System.out.println(n2);
		
		int i = 10;
		i++; //add 1
		++i; //add 1
		System.out.println("I value: "+i);
		System.out.println("\n");
		//WITHOUT ANOTHER VARIABLE i++ WORKS JUST LIKE ADD
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		
		System.out.println(bananas);
		System.out.println(pears);
		System.out.println(apples);
		System.out.println("\n");

		int friends = 10;
		System.out.println(friends++); //not gonna print 11 because POST-INCREMENT, 
										//key word POST, doing the action after asigning
		System.out.println(friends);
		System.out.println("\n");
		
		int p1 = 10;
		int sum = p1++ + 5;
		
		System.out.println(sum);
		System.out.println(p1);
		System.out.println("\n");

		int batteries = 8;
		int oldBatteries = 5;
				//14			//8          +       6
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println(batteries);
		System.out.println(oldBatteries);
		System.out.println(totalBatteries);
		

		
		
		

	}

}
