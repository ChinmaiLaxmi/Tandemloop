package program3;

import java.util.Scanner;

public class Xseriers2 {

	public static void main(String[] args) {
		// Creating Scanner object
		Scanner s = new Scanner(System.in);
		System.out.println();
//Taking input from keyboard
		System.out.println("Enter the number");
		int a = s.nextInt();
		int c = 1;
		if (a % 2 == 0) {
			for (int i = 1; i <= a - 1; i++) {
				System.out.println(c + ",");
				c = c + 2;
			}
		} else {
			for (int i = 1; i <= a; i++) {
				System.out.println(c + ",");
				c = c + 2;
			}
		}
	}

}
