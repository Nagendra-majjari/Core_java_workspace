package in.nagendra;

import java.util.Scanner;

public class DimodPattern {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of stars to print ::");
		int n = scan.nextInt();
		
		isDimond(n);
	}

	private static void isDimond(int n) {

		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k <= (2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1 ;i >= 1;i--) {
			for(int j=i;j < n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k <= (2*i-1);k++) {
				System.out.print("*");
				}
			System.out.println();
			}
	}
	    

}
