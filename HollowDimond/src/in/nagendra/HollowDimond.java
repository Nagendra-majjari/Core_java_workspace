package in.nagendra;

import java.util.Scanner;

public class HollowDimond {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of stars ::");
		int n = scan.nextInt();

		isStar(n);
	}

	private static void isStar(int n) {
		// upper hollow diamond
		for (int i = 1; i <= n; i++) {
			// print the spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			// print the stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// lower hollow diamond
		for (int i = n - 1; i >= 1; i--) {
			// print the spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			// print the stars and hollow spaces
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		int m=5;
		for(int i = n; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
