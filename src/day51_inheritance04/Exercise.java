package day51_inheritance04;

public class Exercise {
	public int perform(int minutes) {
		System.out.println("Doing general exercise");
		return 4*minutes;
	}
}
/*
 * Multiple classes can be stored in same file, 
 * but only one of them needs to be public, 
 * and file name must match the public class.
 */
class Yoga extends Exercise{
	public int perform(int minutes) {
		System.out.println("Doing Yoga exercise");
		return 5*minutes;
	}
}

class JiuJitsu extends Exercise{
	public int perform(int minutes) {
		System.out.println("Doing JiuJitsu exercise");
		return 12*minutes;
	}
}
