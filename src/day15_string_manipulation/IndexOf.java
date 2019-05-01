package day15_string_manipulation;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("java"));
		
		String url="www.okta.com";
		int i = url.indexOf(".");
		System.out.println("pos.of . :"+i);
		System.out.println(url.charAt(i+1));
		
		String title = "Java - Google search";
		//find position of '-' and check if space is on right 
		//and left side
		int sp = title.indexOf("-");
		
		System.out.println("position of space: "+sp);
		System.out.println(title.charAt(sp-2));
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of States: "+states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		// 1) using contains
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		// 2) using index of
		if (word2.indexOf("c++")>-1) {
			System.out.println("c++ is there");
		}
		// because index -1 exist just if combination u put    !!!!!!!!!
   		// doesn't exist in value of the string                !!!!!!!!!
		
		
		
		
	}

}
