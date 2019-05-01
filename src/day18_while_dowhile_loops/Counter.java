package day18_while_dowhile_loops;

class Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int num = 1;
		while(num<=10) {
			System.out.print(num+", ");
			num++;
			Thread.sleep(500);
		}
		int num2 = 11;
		while (num2>=1) {
			System.out.print(num+", ");
			num2--;
			Thread.sleep(500);		}
		
	}

}
