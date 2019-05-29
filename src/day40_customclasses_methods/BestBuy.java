package day40_customclasses_methods;

public class BestBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;
		
		System.out.println("Brand "+cell1.brand);
		System.out.println("Price "+cell1.price);
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "Blue";
		cell2.price = 39.22;
		
		System.out.println("Brand: "+cell2.brand);
		System.out.println("Price: "+cell2.price);
		
		System.out.println("### CALLING METHODS ###");
		cell1.call();
		cell1.message();
		
		Contacts con1 = new Contacts();
		con1.email = "VityaDomingez@gmail.com";
		con1.sendEmail();
		
	}

}
