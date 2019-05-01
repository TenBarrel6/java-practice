package day10_logicaloperators_conditionals;

import java.util.*;

public class CreditScoreRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter number of coupons:");
	    int coupons = scan.nextInt();
	    
	    if(coupons>=10){
	        int candies = coupons/10;
	        System.out.println("Number of Candies: "+candies);
	      }else{
	        System.out.println("Not enough coupons");
	      }
	      if(coupons>=10){
	    	  int gumballs = coupons/3;
	    	  System.out.println("Number of Gumballs: "+gumballs);
	      }else{
	        System.out.println("Not enough coupons");
	      }
	    

	}

}
