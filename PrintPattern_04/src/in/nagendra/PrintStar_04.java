package in.nagendra;

import java.util.Scanner;

public class PrintStar_04 {

	public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       
       System.out.println("Enter the number of stars to be print  :");
       int n = scan.nextInt();
       isPrint(n);
	}

	private static void isPrint(int n) {
		  
         
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*(i-1);j++) {
				System.out.print(" ");
			}
		for(int k=1;k<=(n-i)+1;k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}
