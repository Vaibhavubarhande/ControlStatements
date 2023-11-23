package Conditional;

import java.util.Scanner;

public class switched2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Two digit number");

		int num = sc.nextInt();
		int x = num / 10;
		int y = num % 10;
		

		switch (x) {
		case 0:
			System.out.print("Zero ");
			break;
		case 1:
			System.out.print("One ");
			break;
		case 2:
			System.out.print("Two ");
			break;
		case 3:
			System.out.print("Three ");
			break;
		case 4:
			System.out.print("Four ");
			break;
		case 5:
			System.out.print("Five ");
			break;
		case 6:
			System.out.print("Six ");
			break;
		case 7:
			System.out.print("Seven ");
			break;
		case 8:
			System.out.print("Eight ");
			break;
		case 9:
			System.out.print("Nine ");
			break;

		default:
			System.out.print("Enter a valid number");
			break;
		}
		switch (y) {
		case 0:
			System.out.print("Zero ");
			break;

		case 1:
			System.out.print("One");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		case 6:
			System.out.print("Six");
			break;
		case 7:
			System.out.print("Seven");
			break;
		case 8:
			System.out.print("Eight");
			break;
		case 9:
			System.out.print("Nine");
			break;

		default:
			System.out.print("Enter a valid number");
			break;
		}

	}
}
