package day47_blocks;

public class VariableAccess {
	//instance variable
	int myInstanceVar = 40;
	
	//static variable
	static int myStaticVariable = 55;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myStaticVariable);
//		System.out.println(myInstanceVar); 		<==cannot access non-static from static method
		VariableAccess inVar = new VariableAccess();
		System.out.println(inVar.myInstanceVar);
		System.out.println(inVar.myStaticVariable);
		System.out.println(VariableAccess.myStaticVariable);
	}

}
