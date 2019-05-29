package day46_static;

public class Campus {
	private String city;
	static String country;

	static {
		System.out.println("static block - 1");
		country = "USA";
		System.out.println(country);
	}
	
	static {
		System.out.println("static block - 2");
		country = "Canada";
		System.out.println(country);
	}
	
	public Campus(String city) {
		System.out.println("constructor");
		this.city = city;
	}
	
	public static void campInfo() {
		System.out.println("Welcome info");
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Campus [city=" + city + "]";
	}
	
	
}
