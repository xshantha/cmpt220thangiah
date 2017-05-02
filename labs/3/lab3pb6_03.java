/* Shantha Thangiah
 * CMPT220
 * Lab 3, Problem 6.3
 * This program is to check if an integer is palindrome
 * */

import java.util.Scanner;

public class lab3pb6_03 {
	public static void main(String[] args) {
	 	 	System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
         	System.out.println("Lab 3, Problem 6.3\n"); // This is to display the lab and pb numbers	
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter an integer: ");
	       int number = input.nextInt();
	       String check = " ";
	       
		       if (isPalindrome(number)) {
		    	   // if the user input and reversed was equal, ie: 151 = 151
		    	   check = "is";
		       } else {
		    	   // if the user input and reversed was not equal, ie: 155 <> 551
		    	   check = "is not";    	   
		       }
    	   System.out.print(number + " " + check + " palindrome."); 
		}

		public static boolean isPalindrome(int number) {
			// the boolean value true or false set based on following
			// number is the user input value
			// reverse is user input value now reversed to compare
			return number == reverse(number);
		}
		
		public static int reverse(int number) {
			int rev = 0;
			// this loop to reverse number order to validate plindrome integer
	        while (number > 0) { // condition is input value is greater than 0
	        	// this operation to strip one digit at a time and store in reverse order 
	        	rev = rev * 10 + number % 10;
	        	// this reduces a digit from right to left
	     	   	number = number / 10; 
	        }
			return rev;
		}
}