package day26_arrays04;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"James","Mary",
				"John","Patricia",
				"Robert","Jennifer",
				"Michael","Linda",
				"William","Elizabeth",
				"David","Barbara",
				"Richard","Susan",
				"Joseph","Jessica",
				"Thomas","Sarah",
				"Charles","Margaret",
				"Christopher","Karen",
				"Daniel","Nancy",
				"Matthew","Lisa",
				"Anthony","Betty",
				"Donald","Dorothy",
				"Mark","Sandra",
				"Paul","Ashley",
				"Steven","Kimberly",
				"Andrew","Donna",
				"Kenneth","Emily",
				"George","Carol",
				"Joshua","Michelle",
				"Kevin","Amanda",
				"Brian","Melissa",
				"Edward","Deborah",
				"Ronald","Stephanie",
				"Timothy","Rebecca",
				"Jason","Laura",
				"Jeffrey","Helen",
				"Ryan","Sharon",
				"Jacob","Cynthia",
				"Gary","Kathleen",
				"Nicholas","Amy",
				"Eric","Shirley",
				"Stephen","Angela",
				"Jonathan","Anna",
				"Larry","Ruth",
				"Justin","Brenda",
				"Scott","Pamela",
				"Brandon","Nicole",
				"Frank","Katherine",
				"Benjamin","Samantha",
				"Gregory","Christine",
				"Raymond","Catherine",
				"Samuel","Virginia",
				"Patrick","Debra",
				"Alexander","Rachel",
				"Jack","Janet",
				"Dennis","Emma",
				"Jerry","Carolyn",
				"Tyler","Maria",
				"Aaron","Heather",
				"Henry","Diane",
				"Jose","Julie",
				"Douglas","Joyce",
				"Peter","Evelyn",
				"Adam","Joan",
				"Nathan","Victoria",
				"Zachary","Kelly",
				"Walter","Christina",
				"Kyle","Lauren",
				"Harold","Frances",
				"Carl","Martha",
				"Jeremy","Judith",
				"Gerald","Cheryl",
				"Keith","Megan",
				"Roger","Andrea",
				"Arthur","Olivia",
				"Terry","Ann",
				"Lawrence","Jean",
				"Sean","Alice",
				"Christian","Jacqueline",
				"Ethan","Hannah",
				"Austin","Doris",
				"Joe","Kathryn",
				"Albert","Gloria",
				"Jesse","Teresa",
				"Willie","Sara",
				"Billy","Janice",
				"Bryan","Marie",
				"Bruce","Julia",
				"Noah","Grace",
				"Jordan","Judy",
				"Dylan","Theresa",
				"Ralph","Madison",
				"Roy","Beverly",
				"Alan","Denise",
				"Wayne","Marilyn",
				"Eugene","Amber",
				"Juan","Danielle",
				"Gabriel","Rose",
				"Louis","Brittany",
				"Russell","Diana",
				"Randy","Abigail",
				"Vincent","Natalie",
				"Philip","Jane",
				"Logan","Lori",
				"Bobby","Alexis",
				"Harry","Tiffany",
				"Johnny","Kayla"};
		System.out.println("Total names: "+names.length);
		System.out.println(Arrays.toString(names));
		for(int i = 0; i<names.length; i+=2) {
			System.out.println(names[i]+", "+names[i+1]);
		}
		
		for(int j = 1; j<names.length; j+=2) {
			System.out.print(names[j]+", ");
		}
		System.out.println();
		for(int k = 0; k<names.length; k+=2) {
			System.out.print(names[k]+", ");
		}
		System.out.println();
		System.out.println("****");
//		int rand = (int)(Math.random()*(names.length-1)+1);
//		System.out.println(names[rand]);
		
		// Other solution
		
		Random rand = new Random();
		int r = rand.nextInt(names.length);
		System.out.println(names[r]);
		System.out.println("****");
		
		for(String t:names) {
			if(t.length()<=4) {
				System.out.print(t.toUpperCase()+", ");
			}
		}
		
		String namesUpTo4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		for(String b:names) {
			if(b.length()<=4) {
				namesUpTo4+=b.toUpperCase()+", ";
			}else if(b.length()>=5&&b.length()<=6) {
				names5to6+=b.toUpperCase()+", ";
			}else{
				names7orMore+=b.toUpperCase()+", ";
			}
		}
		System.out.println();
		System.out.println("to 4: "+namesUpTo4.replace(namesUpTo4.substring(namesUpTo4.length()-3, namesUpTo4.length()-1), "."));
		System.out.println("5 to 6: "+names5to6);
		System.out.println("7 or More: "+names7orMore);
		System.out.println("*******");
		//swap womens names with mens
		System.out.println(Arrays.toString(names));
		for(int h = 0; h<names.length-1; h+=2) {
//			String temp1 = names[h+1];
//			names[h+1] = names[h];
//			names[h] = temp1;
			
			String temp1 = names[h+1];
			String temp2 = names[h];
			names[h] = temp1;
			names[h+1] = temp2;
		}
		System.out.println(Arrays.toString(names));
	}

}
