package day22_loops_practice2;

public class LookForWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "He said hi, then she replied hi. hi guys!";
		int count = 0;
		for(int i = 0; i < sentence.length()-1; i++) {
//			System.out.println(sentence.substring(i, i+2));
			if(sentence.substring(i, i+2).equals("hi")) {
				count++;
			}
		}
	}

}
