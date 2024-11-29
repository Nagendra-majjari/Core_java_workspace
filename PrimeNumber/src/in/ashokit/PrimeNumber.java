/*
 * write a program to check whether a given
 * number is a prime number or not. 
 */

package in.ashokit;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number :");
       int num =scan.nextInt();
       boolean status = isPrime(num);
       if(status =true) {
    	   System.out.println("given number is prime");
       }
       else {
    	   System.out.println("given number is not prime");
       }
	}

	private static boolean isPrime(int n) {
		boolean b=true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n % i==0) {
				b=false;
				break;
			}
		}
      	return b;	
	}

}
