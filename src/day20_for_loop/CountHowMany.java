package day20_for_loop;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "computer programming";
		char myChar = 'p';
		
		int counter = 0;
		
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)==myChar) {
				++counter;
			}
		}System.out.println(counter);
	}

}
