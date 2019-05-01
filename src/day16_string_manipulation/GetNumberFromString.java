package day16_string_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "I wrote [1000] lines of code today";
		String numSen = sentence.substring(sentence.indexOf("[")+1, sentence.lastIndexOf("]"));
		int num = Integer.parseInt(numSen);
		System.out.println(num);
		
	}

}
