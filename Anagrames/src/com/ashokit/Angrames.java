package com.ashokit;

import java.util.Arrays;
import java.util.Scanner;

public class Angrames {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the first string :");
     String str1 =sc.nextLine();
     System.out.println("enter the first string :");
     String str2 =sc.nextLine();   
     
     isAnagrame(str1,str2);
	}

	private static void isAnagrame(String str1, String str2) {
         if(str1.length()  != str2.length()) {
        	System.out.println("this are not anagrames");
        	System.exit(0);
         }
        str1.toLowerCase();
        str2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();
        
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        boolean status = true;
        
        for(int i=0;i<=ch1.length-1;i++) {
        	        if(ch1[i] != ch2[i]) {
        		        status=false;
        		               break;
        	}
        }
        if(status=true) {
        	System.out.println("the strings are anagrames");
        }else {
        	System.out.println("the strings are not anagrames");
        }
       
      
	}
	

}
