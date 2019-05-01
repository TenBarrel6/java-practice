package day15_string_manipulation;

public class StartsEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "eclipse";
		
		//startsWith ==> tests if string starts with another letter
		System.out.println("***startsWith***");
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("Ecli"));
		System.out.println();
		System.out.println("***endsWith***");
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("java"));
		System.out.println(word1.toLowerCase().startsWith("EC"));
		System.out.println();
		
		//Mr. ==> male
		//Mrs. ==> married women
		//Ms. ==> single women
		//Dr. ==> doctor men or women
		// ==> Unknown starts
		String name = "Dr. Jackson";
		
		if(name.startsWith("Mr")) {
			System.out.println("male");
		}else if(name.startsWith("Mrs")) {
			System.out.println("married woman");
		}else {
			System.out.println("Unknown status");
		}
		
	}

}
