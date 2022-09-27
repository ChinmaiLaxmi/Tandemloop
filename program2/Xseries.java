package program2;

import java.util.Scanner;

public class Xseries {

	public static void main(String[] args) {
		// Creating Scanner object
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		// Taking input from keyboard
		int a = s.nextInt();
		int c = 1;
		for (int i = 1; i <= a; i++) {
			// Printing output
			System.out.print(c + ",");
			c = c + 2;
		}
	}

}
