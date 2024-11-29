package in.nagendra;

import java.util.Scanner;

public class PrintStar_02 {

	public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       
       System.out.println("Enter the number of stars to be print  :");
       int n = scan.nextInt();
       isPrint(n);
	}

	private static void isPrint(int n) {
         
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
		System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*i;j++) {
				System.out.print(" ");
			}
		for(int k=1;k<=n-i;k++) {
			System.out.print(" *");
		}
		System.out.println();
		}
	}
	}


