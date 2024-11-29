package in.nagendra;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first string ::");
		String str1 = scan.nextLine();
		System.out.println("enter the second string ::");
		String str2 = scan.nextLine();
		
		isAnagrame(str1 ,str2);
	}

	private static void isAnagrame(String str1, String str2) {

		if (str1.length()  != str2.length()) {
			System.out.println("The two string are not anagrame .........");
			System.exit(0);
		}
		str1.toLowerCase();
		str2.toLowerCase();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean flag = true;
		
		for(int i=1;i<ch1.length-1;i++) {
			if(ch1[i] != ch2[i]) {
				flag = false;
				break;
			}
		}
		if(flag = true) {
			System.out.println("The two strings are anagrames::");
			
		}
		else {
			System.out.println("The two strings are not anagrames::");
		}
	}

}
