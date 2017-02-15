/*	Shantha Thangiah
	Lab 1: Writing Java Programs / Problem 2.6
	This program prompts for a user input, then it sums the digits in an integer
	CMPT220 Software Development I */

import java.util.Scanner;
public class lab1pb26 {

	public static void main(String[] args) {
		
		System.out.println("Lab 1: Problem 2.6\n"); 
		  // Prints title of the lab & exercise
		
		System.out.print("Enter a number between 0 and 1000: "); 
		  // Display message to obtain a number from the user.
		Scanner inputVal = new Scanner (System.in);
		int userValue = inputVal.nextInt();
		  // The input value is stored on the local variable userValue.
		
		int runningTotal = 0;
		// The runningTotal variable is initialized.
		while (userValue > 0) {
			/* This while loop shifts to each digit to sum. 
			 * The value must be greater than 0. */
			
		    int remNumber;
		    remNumber = userValue % 10;
		      // The % operator extracts the value.
		    runningTotal = runningTotal + remNumber;
		      // The runningTotal variable keeps a running total of the extracted digits.
		    userValue = userValue / 10;
		      // the backslash operator removes the extracted digits.
		}

		System.out.println("The sum of the digits is " + runningTotal);
		  // Along with this message, the sum of the digits displays.
	}
}
