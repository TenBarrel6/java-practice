package day24_arrays;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java is a general-purpose computer-programming "
				+ "language that is concurrent, class-based, object-oriented, "
				+ "and specifically designed to have as few implementation dependencies "
				+ "as possible.";
		int counter = 0;
		String[] words = sentence.split(" ");
		for(String str:words) {
			System.out.print(str);
			if(str.equals("language")) {
				break;
			}
			counter++;
		}
		System.out.println();
		System.out.print(words[0]);
		System.out.println();
		System.out.print(words[counter]);
		
		
		
	}

}
