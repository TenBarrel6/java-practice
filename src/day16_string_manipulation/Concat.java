package day16_string_manipulation;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Java";
		System.out.println(word.concat(" is fun!"));
		System.out.println(word);
		word = word.concat("+Eclipse");
		System.out.println(word);
		word = word.concat(" Automation");
		System.out.println(word);
		word = word.concat("-Cucumber");
		System.out.println(word);
		// word = word.concat(123); will not work
		word = word + 123;
		System.out.println(word);
		word = word + true; // concat true to the string
		System.out.println(word);
		
		// "+" has more oportunity the "concat" and can do more concatenation
		
		String word2 = "Hi";
		word2 = word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		
		
	}

}
