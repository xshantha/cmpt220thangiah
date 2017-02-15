/*	Shantha Thangiah
	Lab 1: Writing Java Programs / Problem 2.5
	This program prompts for two values and calculate the total
	CMPT220 Software Development I */

import java.util.Scanner;
public class lab1pb25 {

	public static void main(String[] args) {
		
		System.out.println("Lab 1: Problem 2.5\n"); 
		  // Prints title
		System.out.print("Enter the subtotal and a gratuity rate: "); 
		  // Display message to obtain two values from users.
		Scanner inputVal = new Scanner (System.in);	
		double subTotal = inputVal.nextDouble();
		  // The first input value stored in subTotal variable.
		double gratuityRate = inputVal.nextDouble();
		  // The second input value stored in gratuityRate variable.
		double gratuity = subTotal * (gratuityRate/100); 
		  // Calculation of gratuity by multiplying the subTotal times gratuityRate.
		double total = gratuity + subTotal; 
		  // Calculation adding the gratuity to subtotal
		System.out.println("The gratuity is " + gratuity + " and total is " + total); 
		  // Prints total 
	}
}
