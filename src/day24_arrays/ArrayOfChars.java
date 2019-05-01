package day24_arrays;

public class ArrayOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] values = {'a', 'b', 'c'};
		for(char value: values) {
			System.out.print(value);
		}
		
		System.out.println();
		
		String str = "Wooden spoon";
		//this method, toCharArray() converts string into
		//array of characters
		char[] chars = str.toCharArray();
		for(char c:chars) {
			System.out.print(c+"_");
		}
		
		System.out.println();
		
		for(int i = chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
			str+=chars[i];
		}
		System.out.println();
		System.out.print(str);
		
		//TASK
		//Print characters with help of array of characters, one by one 
		//if characters is equals to 'o', replace with '*'
		
		System.out.println();
		str = "Wooden spoon 2";
		char[] chars2 = str.toCharArray();
		for(char o:chars2) {
			if(o == 'o') {
				System.out.print('*');
			}else {
				System.out.print(o);
			}
		}
	}
	
}
