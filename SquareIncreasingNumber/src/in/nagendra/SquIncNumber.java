package in.nagendra;

import java.util.Scanner;

public class SquIncNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ::");
		int n = scan.nextInt();
		isIncrease(n);
	}

	private static void isIncrease(int n) {
		int size = 2 * n - 1;
		int center = n - 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int value = Math.max(Math.abs(i - center), Math.abs(j - center)) + 1;
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
