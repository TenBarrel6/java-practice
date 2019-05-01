package day14_string_methods;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Computer";
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));  ==> ERROR
		//System.out.println(word.charAt(9));  ==> ERROR, cause NOT EXIST
		System.out.println();
		String word2 = "Java";
		if(word2.charAt(0)==('J')) {
			System.out.println("correct");
		}else {
			System.out.println("J is not first");
		}
		
		String word3 = "civic";
		if(word3.charAt(0)==word3.charAt(4)) {
			System.out.println("First and last chars match");
		}else {
			System.out.println("First and last chars are NOT match");
		}
		// Always print last char no matter length of the word
		String word4 = "java";
		char lastChar=word4.charAt(word4.length()-1);
		System.out.println("Last char of "+word4+" is "+lastChar);

	}

}
