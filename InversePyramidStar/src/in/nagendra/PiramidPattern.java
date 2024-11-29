/*print the following pattern
 * 
 *      *********
 *       *******
 *        *****
 *         ***
 *          *
 */

package in.nagendra;

import java.util.Scanner;

public class PiramidPattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of star lines to print ::");
		int n = scan.nextInt();

		isStar(n);
	}

	private static void isStar(int n) {

		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
