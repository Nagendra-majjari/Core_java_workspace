package in.ashokit;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number  :");
        int x = scan.nextInt();
        System.out.println("Enter the second number  :");
        int y = scan.nextInt();
        
       primeRange(x,y);
        
	}

	private static void primeRange(int x, int y) {
         System.out.println("the range of the prime numbers between "+ x +" and "+ y +"");	
         
         for(int i=x;i<=y;i++) {
        	 boolean flag = true;
        	 for(int j=2;j<=Math.sqrt(i);j++) {
        		 if(i % j == 0) {
        			 flag = false;
        			 break;
        		 }
        	 }
        	 if (flag == true) {
        		 System.out.println(i);
        	 }
         }
          
	}

}
