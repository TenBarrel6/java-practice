package day47_blocks;

public class Allblocks {
	int nonStat = 10;
	static int stat = 10;
	
	static {
		System.out.println("static block - only once");
		stat--;
	}
	
	{
		System.out.println("init block - each time object is created, before constructor");
		nonStat +=5;
		stat +=5;
	}
	
	public Allblocks() {
		System.out.println("constructor - each time object is created after int block");
		nonStat += 3;
		stat += 3;
	}
	
	
	
	
}
