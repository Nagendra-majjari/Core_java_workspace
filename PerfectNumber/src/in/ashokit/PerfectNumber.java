/*
 * write a program to check whether 
 * a given number is perfect number or not.
 */
package in.ashokit;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		boolean status = isperfect(n);
		if (status == true) {
			System.out.println(n + " is perfect number");
		} else {
			System.out.println(n + " is a not perfect number");
		}
	}

	private static boolean isperfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n)
			return true;
		else
			return false;
	}

}
