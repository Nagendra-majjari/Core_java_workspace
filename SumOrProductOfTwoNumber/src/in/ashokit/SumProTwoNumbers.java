/*
 * Write a program to take two integers
 * as input and if they are same find 
 * the sum, if they are different
 * then print double of the sum.
 * example:
 *  sample input  expected output
 *     5, 5         10
 *     6, 5         22
 */

package in.ashokit;

import java.util.Scanner;

public class SumProTwoNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scan.nextInt();
		System.out.println("Enter the second number :");
		int b = scan.nextInt();
		findsum(a, b);
	}

	private static void findsum(int a, int b) {
		if (a == b) {
			int sum= a + b;
			System.out.println("sum of two numbers :" +sum);

		} else {
			int pro = (a + b) * 2;
			System.out.println("product of two numbers :" + pro);
		}
	}

}
