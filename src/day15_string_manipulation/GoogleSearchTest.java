package day15_string_manipulation;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item = "java";
		String pageTitle = item+" - Google search";
		
		//test if pageTitle starts with item
		if (pageTitle.startsWith(item)) {
			System.out.println("PASS: Page Title check passed");
			
		}else {
			System.out.println("FAIL: Page Title check faild");
		}
		
		if(pageTitle.endsWith("Google search")) {
			System.out.println("PASS: Page Title check passed");
		}else {
			System.out.println("FAIL: Page Title check faild");
		}
		
	}

}
