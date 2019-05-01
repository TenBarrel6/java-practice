package day23_loops_and_arreys;

public class PrintWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		for(int i = 0; i<=str.length()-1; i++) {
			if(str.substring(i, i+1).equals("a")) {
				continue;
			}
			System.out.println(str.substring(i, i+1));
		}
		
	}

}
