package day46_static;

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Company.cName);
		System.out.println(Company.cName.toUpperCase());
		
		Company c = new Company();
		System.out.println(c.cName);
		c.cInfo();
		Company.cInfo();
		System.out.println(Math.round(345.5665));
	}

}
