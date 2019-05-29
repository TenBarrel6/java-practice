package day37_arraylist;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(5);
		nums.add(55);
		nums.add(234);
		nums.add(2322);
		nums.add(3);
		nums.add(56);
		System.out.println(nums);
		
		nums.remove(5);
		System.out.println(nums);
	}

}
