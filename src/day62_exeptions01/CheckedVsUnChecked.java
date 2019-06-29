package day62_exeptions01;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedVsUnChecked {
	public static void main(String[] args) {
		//checked exception - InterruptedException
		//HANDLE-OR-DECLARE
		try {
			System.out.println("Sleeping");
			Thread.sleep(2000);	
		}catch(InterruptedException e) {
			System.out.println("thread is interrupted");
		}
		System.out.println("woke up");
		
		try {
			URL url = new URL("htwww.google.com");
			System.out.println(url.toString());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
