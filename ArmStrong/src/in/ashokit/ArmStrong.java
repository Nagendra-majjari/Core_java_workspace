package in.ashokit;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
     System.out.println("Enter the first number  :");
     int number = scan.nextInt();
    
     isArmStrong(number);
	}

	private static void isArmStrong(int number) {
        int temp = number;
        String str = String.valueOf(number);
        int len = str.length();
        int sum = 0;
        
        while(number>0) {
        	int d = number % 10 ;
        	sum =sum + (int)Math.pow(d,len);
        	number = number / 10 ;
        }
        if ( temp == sum) {
        	System.out.println(number+":  is ArmStrong number");
        }
        else {
        	System.out.println(number+":  is not a ArmStrong number");
        }
	}

}
