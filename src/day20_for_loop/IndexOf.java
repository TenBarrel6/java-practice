package day20_for_loop;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "amazon";
		char letter = 'z';
		int index = -1;
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i)==letter) {
				index = word.indexOf(word.charAt(i));
				break;
			}
		}System.out.println(index);
		
	}

}
