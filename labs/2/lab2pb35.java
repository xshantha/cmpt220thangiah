/*	Shantha Thangiah
	Lab 2: Selections, Mathematical Functions, Characters and Strings / Problem 3.5
	This program generates 3 integer and prompts user for sum, then validates
	CMPT220 Software Development I */

import java.util.Scanner;

public class lab2pb35 {

	 public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
	    int todayNo = input.nextInt();
	
	    System.out.print("Enter the number of days elapsed since today: ");
	    int elapsedDay = input.nextInt();
	
	    int futureDay = (todayNo + elapsedDay) % 7;
	    switch (todayNo) {
	        case 0:
	            System.out.print("Today is Sunday and");
	            break;
	        case 1:
	            System.out.print("Today is Monday and");
	            break;
	        case 2:
	            System.out.print("Today is Tuesday and");
	            break;
	        case 3:
	            System.out.print("Today is Wednesday and");
	            break;
	        case 4:
	            System.out.print("Today is Thursday and");
	            break;
	        case 5:
	            System.out.print("Today is Friday and");
	            break;
	        case 6:
	            System.out.print("Today is Saturday and");
	            break;
	
	    }
	
	    switch (futureDay) {
	        case 0:
	            System.out.print(" the future day is Sunday.");
	            break;
	        case 1:
	            System.out.print(" the future day is Monday.");
	            break;
	        case 2:
	            System.out.print(" the future day is Tuesday.");
	            break;
	        case 3:
	            System.out.print(" the future day is Wednesday.");
	            break;
	        case 4:
	            System.out.print(" the future day is Thursday.");
	            break;
	        case 5:
	            System.out.print(" the future day is Friday.");
	            break;
	        case 6:
	            System.out.print(" the future day is Saturday.");
	            break;

    }
  }
}