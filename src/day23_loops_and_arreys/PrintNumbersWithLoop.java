package day23_loops_and_arreys;

public class PrintNumbersWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is just to print numbers from one to ten
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		for(int j = 1; j <= 5; j++) {
//			for(int i = 1; i <= 10; i++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		int n = 16;
		int count = 1;
		for(int i = 1; i <= n; i++) {
			count*=i;
		}
		
		    System.out.println(count);
	}

}
