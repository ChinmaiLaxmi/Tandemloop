package program1;

import java.util.Scanner;

public class SmallCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, result;
		String operator;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the type of operation");
		operator = s.nextLine();
		System.out.println("Enter the first number");
		a = s.nextDouble();
		System.out.println("Enter the secound number");
		b = s.nextDouble();

		switch (operator) {
		case "Additon":
			result = a + b;
			System.out.println("The addition of two numbers is " + result);
			break;
		case "Substraction":
			result = a - b;
			System.out.println("The substraction of two numbers is " + result);
			break;
		case "Multiplication":
			result = a * b;
			System.out.println("The multiplication of two numbers is " + result);
			break;
		case "Division":
			result = a / b;
			System.out.println("The division of two numbers is " + result);
			break;
		default:
			System.exit(0);
		}

	}

}
