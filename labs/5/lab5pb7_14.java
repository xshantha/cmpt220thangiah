/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 7.14
 * This program to compute GCD
 */

import java.util.Scanner;

public class lab5pb7_14 {
	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 7.14\n"); // This is to display the lab and pb numbers
		
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];

		System.out.print("Enter 5 numbers: ");

		 for (int i = 0; i < numbers.length; i++) {
		  numbers[i] = input.nextInt();
		 }
		 
		System.out.println("The GCD is " + gcd(numbers));
	}
 
	// Using Euclidean algorithm  
	public static int gcd(int... numbers) {
		int gcd = min(numbers);

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % gcd == 0) {
				numbers[i] = gcd;
			} else {
				numbers[i] = numbers[i] % gcd;
			}
		}

		if (gcd == min(numbers)) {
			return gcd;
		}

		return gcd(numbers);
	}

	
	public static int min(int... numbers) {
		int min = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
}