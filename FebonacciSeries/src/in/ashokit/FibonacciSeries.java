package in.ashokit;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter number of terms of the fibonacci series :");
      int number = scan.nextInt();
      
      fibonacciSeries(number);
	}

	private static void fibonacciSeries(int number) {
        int firstTerm=0,secTerm=1;
        
        if(number == 1) {
        	System.out.println(firstTerm);
        	return;
        }
        if(number == 2) {
        	System.out.println(firstTerm);
        	System.out.println(secTerm);
        	return;
        }
        System.out.println(firstTerm);
    	System.out.println(secTerm);
    	for(int i=3;i<=number;i++) {
    		int nextTerm = firstTerm+secTerm;
    		System.out.println(nextTerm );
    		firstTerm=secTerm;
    		secTerm=nextTerm;
    	}
	}

}
