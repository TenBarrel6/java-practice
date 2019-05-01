package day14_string_methods;

public class StringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Good morning";
		//check if it matches "Good morning" 
		//and print match || not match
		
		// Convert to upperCase and print
		
		if (str1.contentEquals("Good morning")) {
			System.out.println("Match");
			
		}else {
			System.out.println("Not match");
		}
		if (str1.equalsIgnoreCase("good morning")){
			System.out.println("Match - ignore case");
			
		}else {
			System.out.println("Not match - ignore case");
		}
		
		System.out.println(str1.toUpperCase()); // not assigning another value
		System.out.println(str1); //it stays the old value
		str1 = str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		
		//combine the above methods together
		//convert to all lowercase first then check if equals "good morning"
		
		       //good morning=>good morning
		if(str1.toLowerCase().contentEquals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: not match");
		}
		
		//FIND OUT HOW MANY CHARACTERS IN THE STRING
		String myName = "Ruslan";
		System.out.println(myName.length());
		int length = myName.length();
		System.out.println("My Name's legth: "+length);
		
		//username must be exactly 8 characters
		String userName = "Ruslan";
		if(userName.length()==8) {
			System.out.println("Correct username");
		}else {
			System.out.println("Wrong username, must be 8 characters");
		}
		//password should be less or equals 6 char
		String password = "12345";
		if (password.length()<=6) {
			System.out.println("Correct password");
		}else {
			System.out.println("Wrong password, nust be 6 characters");
		}
		
		int passwordLength = password.length();
		if(passwordLength==6) {
			System.out.println("Correct password");
		}else {
			System.out.println("Wrong password, nust be 6 characters");
		} 

	}

}
