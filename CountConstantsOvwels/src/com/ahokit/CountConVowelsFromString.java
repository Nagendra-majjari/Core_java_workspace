package com.ahokit;

import java.util.Scanner;

public class CountConVowelsFromString {

	public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("Enter a the number :");
     String str = scan.nextLine();
     
     countConsonentsandVowels(str);
	}

	private static void countConsonentsandVowels(String str) {
        int cCont = 0;
        int vCont = 0;
        str = str.toLowerCase();
        
        char ch[] = str.toCharArray();
        for( int i=0 ; i<ch.length; i++) {
        	if( ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u') {
        		vCont++;
        	}
        	else if(!Character.isDigit(ch[i])) {
        		cCont++;
        	}
        }
        System.out.println(vCont);
        System.out.println(cCont);
      }

}
 