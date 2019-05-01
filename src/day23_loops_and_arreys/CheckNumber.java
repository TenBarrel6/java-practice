package day23_loops_and_arreys;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 20; i++) {
			if(i>=5&&i<=10) {
				continue;
			}
			System.out.println("Number "+i);
		}
	}

}
