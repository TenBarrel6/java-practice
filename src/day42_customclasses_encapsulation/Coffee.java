package day42_customclasses_encapsulation;

public class Coffee {
	String name, size, calories; double price;
	
	public void getCoffeInfo() {
		String info = name.toUpperCase()+"   "+size.toUpperCase()+"   $"+price+" "+calories+" CAL";
		System.out.println(info);
	}
	
	public void setName(String newName) { // It will assign newName to name instance variable
		name = newName;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCal(String newCal) {
		calories = newCal;
	}
	
	public void setCoffeeInfo(String newName,String newSize, double newPrice, String newCal) {
		name = newName;
		size = (newSize);
		price = newPrice;
		calories = newCal;
	}
}
