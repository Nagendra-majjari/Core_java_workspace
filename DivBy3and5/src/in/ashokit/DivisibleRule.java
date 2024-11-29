/*
 * Write a program to take an integer 
 * as input and do the following.
 *   1. if it is divisible by 3 then display "zip".
 *   2. if it is divisible by 5 then display "zap".
 *   3. if it is divisible by 3 & 5 then display "hurray!".
 *   4. otherwise, display "not divisible by 3 or 5".
 */

package in.ashokit;

import java.util.Scanner;

public class DivisibleRule {

	public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter the number :");
      long n = scan.nextInt();
      isDivisible(n);
	}

	private static void isDivisible(long n) {
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("zip");
		}
		else if(n % 3 == 0) {
			System.out.println("zap");
		}
		else if(n % 5 == 0) {
			System.out.println("hurry");	
		}
		else {
			System.out.println("not divisible by 3 and 5");
		}
		}
	}


