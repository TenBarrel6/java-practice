package day47_blocks;

public class AllblockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Allblocks b1 = new Allblocks();
//		Allblocks b2 = new Allblocks();
//		System.out.println(b1.nonStat);
//		System.out.println(b1.stat);
//		System.out.println(b2.nonStat);
//		System.out.println(b2.stat);
		System.out.println(reverseLetters("q.....we!rty$"));
		System.out.println(16/3);
	}
	
	public static String reverseLetters(String word){
		//TODO
		String temp = "", tempWord = word; int pos = 0;
		
		for(int i = word.length()-1; i>=0; i--){
		  temp+=Character.isAlphabetic(word.charAt(i))?word.charAt(i):"";
		}
		
		for(int i = 0; i<word.length(); i++){
			if(Character.isAlphabetic(word.charAt(i))) {
				
				tempWord = tempWord.replace(tempWord.charAt(i), temp.charAt(pos));
				
				pos++;
			}
//			System.out.print(word.charAt(i));
//		  word = Character.isAlphabetic(word.charAt(i))
//		  ?word.replace(word.charAt(i), temp.charAt(pos))
//		  :word.replace("", "");
//		  pos = Character.isAlphabetic(word.charAt(i))
//				?pos++
//				:pos;
		}
		return tempWord;
	}

}
