package day33_methods05;

public class AgeCulc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ageCulculator(1973, 2019));
	}
	
	public static int ageCulculator(int dob, int year) {
		int age = year - dob;
		if(age>=1 && age<=14) {
			System.out.println("Child");
		}else if(age>=15 && age<=25) {
			System.out.println("Youngster");
		}else if(age>=36 && age<=64) {
			System.out.println("Adult");
		}else if(age<=0) {
			System.out.println("Invalid age");
		}else {
			System.out.println("Senior");
		}
		return age;
	}

}
