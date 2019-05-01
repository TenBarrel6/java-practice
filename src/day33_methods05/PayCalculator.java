package day33_methods05;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHoutlyPay(87, 0));
	}
	
	public static int getHoutlyPay(int hours, int rate) {
		if(hours <= 0) {
			System.out.println("invalid hours");
			return 0;
		}else if(rate <= 0) {
			System.out.println("invalid rate");
			return 0;
		}else {
			int wage = hours*rate;
			return wage;
		}
		
		
	}

}
