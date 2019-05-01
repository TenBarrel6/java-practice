package day20_for_loop;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int n = 1; n <= 100; n++) {
			if(n%2 == 0) {
				System.out.print(n+" ");
			}
		}
		System.out.println();
		for(int j = 1; j <= 100; j++) {
			if(j%2 != 0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		int sumOfOdds = 0;
		int sumOfEvens = 0;
		for(int num = 1; num <= 100; num++) {
			if(num%2 == 0) {
				sumOfEvens += num;
			}else {
				sumOfOdds += num;
			}
		}System.out.println(sumOfEvens);
		System.out.println();
		System.out.println(sumOfOdds);
	}

}
