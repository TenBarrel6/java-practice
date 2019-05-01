package day19_loops;

public class Print_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Amazon";
		int idx = word.length()-1;
//		while(idx<word.length()) {
//			System.out.println(word.charAt(idx++));
//		}
		while(idx>=0) {
			System.out.println(word.charAt(idx--));
		}
	}

}
