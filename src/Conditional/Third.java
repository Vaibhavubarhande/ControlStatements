package Conditional;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Age");

		int num = sc.nextInt();

		if (num > 0 && num < 18) {
			System.out.println("You are a Child");
		} else {
			if (num > 18 && num < 60) {
				System.out.println("You are Adult");
			} else {
				if (num > 60)
					System.out.println("You Are Senior Citizen");
			}

		}
	}
}