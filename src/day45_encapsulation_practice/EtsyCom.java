package day45_encapsulation_practice;

public class EtsyCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EtsyAccount acc1 = new EtsyAccount();
		System.out.println(acc1.toString());
		
		acc1.setEmail("asdgsdf@gmail.com");
		acc1.setFirstName("Barak");
		acc1.setPassword("asdgsg235");
		
		System.out.println(acc1.toString());
		
		EtsyAccount acc2 = new EtsyAccount();
		
		acc2.setEmail("asdgljsgd.info");
		acc2.setFirstName("");
		acc2.setPassword("sdf");
		
		System.out.println(acc2.toString());
		
		EtsyAccount acc3 = new EtsyAccount("@gmail.com", "aasdf sdf", "345345" );
		System.out.println(acc3.toString());
		
		EtsyAccount acc4 = new EtsyAccount("Chuvy@gmail.com", "Chubaka");
		System.out.println(acc4.toString());
	}

}
