package day12_switch_ternary;
import java.util.*;
public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How is the weather today?");

		String weather = scan.nextLine().toLowerCase();
		switch(weather) {
		case "sunny":
			System.out.println("Go out.");
			System.out.println("Code Java");
			break;
		case "hot":
			System.out.println("Go swimming");
			System.out.println("Code Java");
			break;
		case "windy":
			System.out.println("Fly a kite.");
			System.out.println("Code Java");
			break;
		case "rainy":
			System.out.println("Go shopping.");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tires");
			System.out.println("Go skiing.");
			System.out.println("Code Java");
			break;
		default:
			System.out.println("Code Java in any other weather");

		}
		
	System.out.println("#### END OF PROGRAM ####");
		

	}

}
