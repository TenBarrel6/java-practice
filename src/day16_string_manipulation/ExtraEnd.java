package day16_string_manipulation;

public class ExtraEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "va";
		String result;
		
		if(str.length() == 2) {
			result = str+str+str;
		}else {
			result = str.substring(str.length()-2);
			result = str + result + result;
		}
		System.out.println(result);
		

	}

}
