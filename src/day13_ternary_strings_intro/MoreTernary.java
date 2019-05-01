package day13_ternary_strings_intro;

public class MoreTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quality = "good";
		int rating = (quality.equals("good")) ? 100 : 0;
		System.out.println(rating);
		
		int PMhour = 6;
		//Rush hour during evening: 4 - 7
		boolean rushHour = PMhour >= 4 && PMhour <= 7 ? true : false; 
		System.out.println(rushHour);
	}

}
