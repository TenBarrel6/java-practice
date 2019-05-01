package day18_while_dowhile_loops;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'a';
		while (letter <= 'z') {
			System.out.print(letter+" ");
			letter++;
		}
		System.out.println("\n");
		char letterCap = 'A';
		while (letterCap <= 'Z') {
			System.out.print(letterCap+" ");
			letterCap++;
		}
		System.out.println("\n");
		char letter1 = 'z';
		while (letter1 >= 'a') {
			System.out.print(letter1+" ");
			letter1--;
		}
		System.out.println("\n");
		String letters = "";
//		letters = letters+'A';
//		System.out.println(letters);
//		
//		letters = letters+'B';
//		System.out.println(letters);
//		
//		letters = letters+'C';
//		System.out.println(letters);
//		
//		letters = letters+'D';
//		System.out.println(letters);
//		
//		letters = letters+'E';
//		System.out.println(letters);
//		
//		letters = letters+'F';
//		System.out.println(letters);
//		
//		letters = letters+'G';
//		System.out.println(letters);
		
		System.out.println();
		System.out.println();
		
		char myLetter = 'A';
		while(myLetter <= 'Z') {
			letters = letters+myLetter;
			System.out.println(letters);
			myLetter++;
		}
	}

}
