package day20_for_loop;

public class PrintEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Amazon";
		for(int i = 0; i<word.length(); i++) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		for(int i = 0; i<word.length(); i++) {
			char letter = word.toLowerCase().charAt(i);
			if(letter=='a'||letter=='e'||letter=='o'||letter=='i'||letter=='u') {
				System.out.print(letter+", ");
			}
		}
		String txt = "sdf";
		System.out.println(txt.replace(txt.substring(txt.length()-1), ""));
	}

}
