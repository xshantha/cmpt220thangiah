/* Shantha Thangiah
 * CMPT220
 * Lab 3, Problem 5.1
 * This program to calculate number of negatives, positives, sum, and average
 */

import java.io.IOException;
import java.util.Scanner;

public class lab3pb5_01 {
 
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

     int positive = 0, negative = 0, total = 0, count = 0;
 	 System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
     System.out.println("Lab 3, Problem 5.1\n"); // This is to display the lab and pb numbers
     System.out.print("Enter the number: "); 	 // Prompts user to enter the numbers
     
     int number;
     while((number = input.nextInt()) != 0) {
         total += number;
         count++; 
         if(number > 0){ // Numbers greater than 0 will be a positive number
             positive++; // this variable keep track of the positive numbers
         } else if(number < 0) { // Numbers less than 0 will be a negative number
             negative++; // this variable keeps track of the negative numbers
         }
     } // The while loop ends here
     
     float average = total / (float) count; // Calculation for average
     System.out.println("The number of positives is " + positive); // Counts of positive numbers
     System.out.println("The number of negatives is " + negative); // Counts of negative numbers
     System.out.println("The total is " + total); // Sum of entered numbers
     System.in.close();
     System.out.println("The average is " + average); 
     }
 }