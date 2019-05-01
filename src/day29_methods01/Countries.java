package day29_methods01;
import java.util.*;
public class Countries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countriesArray = {{"USA","Washington DC"},
									{"Canada", 	"Ottawa"},
									{"Mexico","Mexico city"},
									{"Brasil","Brasilia"},
									{"Peru", "Lima"},
									{"Argentina", "Boanes Aeros"},
									{"Bolivia","La Paz"},
									{"Macedonia","Scopia"},
									{"Kazakhstan","Nursultan"}};
		System.out.println(countriesArray[0][0]+"|"+countriesArray[0][1]);
		System.out.println(countriesArray[8][0]+"|"+countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		
		String count = "";
		for(int i = 0; i<countriesArray.length; i++) {
			count += " | "+countriesArray[i][0];
			System.out.print(countriesArray[i][0]+"|");
		}
		System.out.println();
		for(String[] country:countriesArray) {
			System.out.print(country[0]+"|");
		}
		
		//get all the Cities and add to cities[] array;
		String[] cities = new String[countriesArray.length];
		for(int j = 0; j<countriesArray.length; j++) {
			cities[j] = countriesArray[j][1];
		}
		System.out.println();
		System.out.println(Arrays.toString(cities));
		
		for(int i = 0; i<countriesArray.length; i++) {
			if(countriesArray[i][0].equals("Bolivia")) {
				if(countriesArray[i][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				}else {
					System.out.println("Bolivia test failed");
				}
				break;
			}
		}
	}

}
