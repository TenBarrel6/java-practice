package day13_ternary_strings_intro;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		int score = 48;
		if(score > 60) {
			result = "pass";			
		}else {
			result = "fail";
		}
		System.out.println(result);
		
		result = score > 60 ? "pass" : "fail";
		System.out.println(result);

		
		
	}

}
