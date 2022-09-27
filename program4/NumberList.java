package program4;

import java.util.Scanner;

public class NumberList {

	public static void main(String[] args) {
		// Taking input from keyboard 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total numbers present in directory");
		int numb = s.nextInt();
		int[] arr = new int[numb];
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print("Enter the number");
			arr[i] = s.nextInt();
		}
		for (int i = 1; i <= 9; i++) {
			int c = 0;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[j] % i == 0) {
					c = c + 1;
				}
			}
			System.out.println(i + ":" + c);
		}
	}

}
