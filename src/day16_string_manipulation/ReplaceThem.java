package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(withNoSpace);	
		
		String mixed = "*j&*$av%&a";
		mixed = mixed.replace("&", "").replace("*", "").replace("%", "").replace("$", "");
		System.out.println(mixed);
		
		String result = "About 115,000,000 results (0.59 seconds)";
		int st = result.indexOf(" ")+1;
		int end = result.indexOf(" ", st+1);
		String w = result.substring(st, end);
		int value = Integer.valueOf(w.replace(",", ""));
		System.out.println(value);
		
		
	}

}
