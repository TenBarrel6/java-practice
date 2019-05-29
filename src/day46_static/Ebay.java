package day46_static;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer("Barak Obama", "barak@whitehouse.gov");
		Customer cust2 = new Customer("Angela Merkel", "merkel@germ.gov");
		Customer cust3 = new Customer("Petro Poroshenko", "poroh@admin.gov");
		
		System.out.println(cust3.count);
		System.out.println(Customer.count);
		
		Customer cust4 = new Customer("Kim Chin In", "bigBomb@gmail.com");
		
		System.out.println(cust4.count);
		cust1.count = 10;
		System.out.println(cust3.count);
		System.out.println(Customer.count);
		
		
		
	}

}
