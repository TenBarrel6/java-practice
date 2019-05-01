package day15_string_manipulation;

public class IdexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// index of woth 2 inputs
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		int secondDash = list.indexOf("-", 5);
		System.out.println(secondDash);
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		//find the last dash
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);
		int previousDash = list.lastIndexOf("-", lastDash-1);
//!!!!!   this type of code gonna show u the privious one before the last on		
		System.out.println(previousDash);
		

	}

}
