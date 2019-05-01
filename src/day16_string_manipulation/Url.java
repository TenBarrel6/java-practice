package day16_string_manipulation;

import java.util.Scanner;

public class Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter URL:");
		String url = scan.next();
		int dotIndex = url.lastIndexOf(".");
		
		String domain = url.substring(4, dotIndex);
		String extension = url.substring(dotIndex+1,(dotIndex+4));
		
		if(url.startsWith("www.")) {
				System.out.println("www. is present");
		}else {
			System.out.println("Invalid URL format");
			return;
		}
		
		if (url.charAt(dotIndex)=='.') {
			System.out.println(". is there before extension");
		}else {
			System.out.println(". might be misplaced");
		}
		
		System.out.println("Domain: "+domain);
		System.out.println("Extension: "+extension);
		
		
		
	}

}
