/*	Shantha Thangiah
	Lab 1: Writing Java Programs / Problem 2.1
	This program prompt for celsius value, then convert it to fahrenheit
	CMPT220 Software Development I */

import java.util.Scanner;
public class lab1pb21 {

	public static void main(String[] args) {
		
		System.out.println("Lab 1: Problem 2.1\n"); // Prints title
		System.out.print("Enter a degree in Celsius: "); // Input message
		Scanner inputVal = new Scanner (System.in);	
		double tempC = inputVal.nextDouble();// Sets the input value to variable
		double tempF = (9.0 / 5) * tempC + 32; // Calculation for Celsius to Fahrenheit conversion
		
		System.out.println(tempC + " Celsius is " + tempF + " Fahrenheit"); // Prints temperature in Fahrenheit
	}
}
