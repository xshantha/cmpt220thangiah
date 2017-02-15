/*	Shantha Thangiah
	Lab 2: Selections, Mathematical Functions, Characters and Strings / Problem 3.2
	This program generates 3 integer and prompts user for sum, then validates
	CMPT220 Software Development I */

import java.util.Scanner;

public class lab2pb32 {

	 public static void main(String[] args) {
		 
			System.out.println("Lab 2: Problem 3.2\n"); // Displays lab & pb#
			  // the following generates 3 integers
		 	int number1 = (int)(System.currentTimeMillis() % 10);
		 	int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		 	int number3 = (int)(System.currentTimeMillis() / 3 % 10);
		 	
		 		// Create a Scanner
		 	Scanner input = new Scanner(System.in);
		 		// Displays the generated integers
		 	System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
		 		// Obtain user input
		 	int answer = input.nextInt();
		 		// Displays the integers, sum, and validity of user's input
		 	System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer +
		 		" is " + (number1 + number2 + number3 == answer));
		 	
	 }
}
