package day15_string_manipulation;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, tomatoes, eggs, milk, bread, cereal, meat";
		
		if(list.contains("apples")) {
			System.out.println("Apples are there!");			
		}else {
			System.out.println("Let's add apples now!");
		}
		
		boolean hasEggs = list.contains("eggs");
		System.out.println("Contains eggs: "+hasEggs);
		
		boolean hasCucumbers = list.contains("cucumbers");
		System.out.println("Contains cucumbers: "+hasCucumbers);
		
		email = "test@yahoo.com";
		if(email.contains("gmail")) {
			System.out.println("it is yahoo email");
		}else if(email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}else if(email.contains("yahoo")) {
			System.out.println("Yahoo account");
		}
		
		String name = "Saddam Hussein";
		
		if(name.contains("a")) {
			System.out.println("A is there");
		}else if (name.contains("e")) {
			System.out.println("E is there");
		}
	}

}
