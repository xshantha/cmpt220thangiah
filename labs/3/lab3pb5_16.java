/* Shantha Thangiah
 * CMPT220
 * Lab 3, Problem 5.16
 * This program to find the factors of an integer.
 * */

import java.util.Scanner;
	
public class lab3pb5_16	{
	
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 3: Problem 5.16 \n"); // Displays lab & pb info
		System.out.print("Enter a positive number: "); // Prompts for user input
	
		int number = userInput.nextInt();
		System.out.println("\nThe factors for " + number + " are");
		int factor = 2; // The variable factor begins with a value 2
			
		while (factor <= number) // Conditional loop input value is less than or equal to the factor
			if (number % factor == 0) {
	  		  number /= factor;
			  System.out.print(factor + " "); // Display the results
			}

			else {
				factor++;
			}
  }
}
