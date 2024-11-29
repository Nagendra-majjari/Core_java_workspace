package in.nagendra;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows ::");
		int n = scan.nextInt();
		isNumber(n);
		}

	private static void isNumber(int n) {

		for(int i=1; i <= n;i++) {
			//printing spaces
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			//print increasing numbers
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			//print decreasing numbers
			for(int k=i-1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
