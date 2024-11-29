package in.ashokit;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
   Scanner scan = new Scanner (System.in);
   System.out.println("enter the first number");
   int x = scan.nextInt();
   System.out.println("enter the second number");
   int y = scan.nextInt();
   
   rangePrime(x,y);
	}

	private static void rangePrime(int x, int y) {
      System.out.println("the range is");
      
      for(int i=x;i<=y;i++) {
    	  boolean flag=true;
    	  for(int j=2;j<=Math.sqrt(i);j++) {
    		  if(i % j == 0) {
    			  flag=false;
    			  break;
    		  }
    	  }
    	  if(flag==true) {
    		  System.out.println(i);
    	  
      }
	}

	}
}
