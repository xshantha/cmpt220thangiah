/*	Shantha Thangiah
	Lab 2: Selections, Mathematical Functions, Characters and Strings / Problem 3.2
	This program generates 3 integer and prompts user for sum, then validates
	CMPT220 Software Development I */

import java.util.Scanner;
public class lab2pb420 {
	public static void main(String args[]){

		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("\nThe first character of the string is " + ch);
		
		
		//System.out.println("Your string is: " + firstLetter);
		System.out.print("and the length of the string is " + s.length() + " character(s).");
	}
}
