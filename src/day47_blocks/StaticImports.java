package day47_blocks;
import static java.lang.Math.*;
import static java.lang.Character.*;
import static java.time.LocalDateTime.now;
public class StaticImports {
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(max(10,9));
		System.out.println(min(10,9));
		System.out.println(floor(4.454));
		System.out.println(round(23.435));
		System.out.println(abs(-10));
		System.out.println(pow(10.3, 2));
		System.out.println(sqrt(5));
		System.out.println(random()*10);
		//================================
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('G'));
		//====================================
		System.out.println(now());
		
		
	}
}
