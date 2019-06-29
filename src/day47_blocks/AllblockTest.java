package day47_blocks;

import java.util.*;

public class AllblockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Allblocks b1 = new Allblocks();
//		Allblocks b2 = new Allblocks();
//		System.out.println(b1.nonStat);
//		System.out.println(b1.stat);
//		System.out.println(b2.nonStat);
//		System.out.println(b2.stat);
//		System.out.println(reverseLetters("q.....we!rty$"));
//		int[][] arr = {{1,2},{3,4}};
//		arr[1]= arr[0];
//		System.out.println(arr[1]);
		
		
	}
	
	public static String reverseLetters(String word){
		//TODO
		String temp = "", tempWord = word; int pos = 0;
		
		for(int i = word.length()-1; i>=0; i--){
		  temp+=Character.isAlphabetic(word.charAt(i))?word.charAt(i):"";
		}
		
		System.out.println(temp);
		
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
