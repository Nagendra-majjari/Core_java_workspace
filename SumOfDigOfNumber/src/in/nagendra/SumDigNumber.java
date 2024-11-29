/*
 * write a program to find the
 * sum of the digits of a given 
 * number.
 * ex: number = 123
 *    op: 6
 */



package in.nagendra;

import java.util.Scanner;

public class SumDigNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		isDigSum(n);
	}

	private static void isDigSum(int n) {

		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
