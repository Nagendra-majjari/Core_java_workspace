package com.ashokit;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = scan.nextInt();
        if(isSpyNumberOrNot(num)) {
        	System.out.println(num +"   is a spy number");
        }
        else {
        	System.out.println(num +"   is not a spy number");
        }
	}

	private static boolean isSpyNumberOrNot(int num) {
        int sum = 0 ;
        int product = 1 ;
        
        while(num != 0) {
        	int digit = num % 10;
        	sum = sum + digit ;
        	product = product * digit;
        	num = num / 10 ;
        }
        return sum == product;
	}

}
