/*	Shantha Thangiah
	Lab 1: Writing Java Programs / Problem 2.9
	This program prompts takes 3 user inputs to calc avg acceleration
	CMPT220 Software Development I */

import java.util.Scanner;
public class lab1pb29 {

	public static void main(String[] args) {
		
		System.out.println("Lab 1: Problem 2.9\n"); 
		  // Prints title
		System.out.print("Enter v0, v1, and t: "); 
		  // Display message to obtain three values from the user.
		Scanner inputVal = new Scanner (System.in);	
		double v0 = inputVal.nextDouble();
		  // First input value stored on v0 variable
		double v1 = inputVal.nextDouble();
		  // Second input value stored on v1 variable
		double t = inputVal.nextDouble();
		  // Thrid input value stored on t variable.
		double accAvg = ((v1 - v0) / t);
//DecimalFormat df = new DecimalFormat("#.####");
		  // Calculates the average acceleration.
		// System.out.println("The average acceleration is " + roundOff);
		System.out.printf("The average acceleration is " + "%.4f", accAvg);
				
		  // Displays the calculated results with a message.
	}
}
