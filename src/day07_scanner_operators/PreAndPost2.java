package day07_scanner_operators;

public class PreAndPost2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int messages = 10;
		messages++; //11
		++messages; //12
		System.out.println(messages);
		System.out.println("\n");
		
		int readMessages = --messages;
		System.out.println(readMessages);
		System.out.println(messages);
		System.out.println("\n");


		int unreadMessages = readMessages--;
		System.out.println(unreadMessages);
		System.out.println(readMessages);
		System.out.println("\n");
		
		int total = unreadMessages++ - readMessages--;
		System.out.println(unreadMessages);
		System.out.println(readMessages);
		System.out.println(total);
		System.out.println("\n");

		
		int count = 20;
		int count2 = 10;
		int totalCount= ++count + --count2;
		System.out.println(count);
		System.out.println(count2);
		System.out.println(totalCount);
		System.out.println("\n");
		//     44       21    +    23
		int myCount = count++ + ++count;
		System.out.println(count);
		System.out.println(myCount);
		



	}

}
