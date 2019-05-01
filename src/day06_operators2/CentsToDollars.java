package day06_operators2;

public class CentsToDollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes = 24234;
		int hours = minutes/60;
	

		int remainingMinutes = minutes%60;
		
		System.out.println(hours+" hours and "+remainingMinutes+" minutes, \r remaining minutes = "+remainingMinutes);
		
		long cents = 345345;
		long dolars = cents/100;
		long centsLeft = cents%100;
		
		System.out.println("You have "+dolars+"$ dolars and "+centsLeft+" cents.");

	}

}
