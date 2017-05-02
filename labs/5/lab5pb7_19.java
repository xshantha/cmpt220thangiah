/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 7.19
 * This program to identify a list is sorted
 */

import java.util.Scanner;

public class lab5pb7_19 {
	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 7.19\n"); // This is to display the lab and pb numbers

		System.out.print("Enter list: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int[] list = new int[a];
 
		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
 
		String sortStatus = " not ";
		
		// Based on if the numbers are sorted or not sortStatus variable changes
		if (isSorted(list))
			sortStatus = " already ";
		
		// Displays the sort status of the list with a messages
		System.out.print("The list is" + sortStatus + "sorted");
	}
 
 

	public static boolean isSorted(int[] list) {
		int a = list.length - 1;
		boolean isSorted = true;
		
		// this loop to compare elements values to decide if the number are sorted
		for (int i = 0; i < a; i++) {
			if (list[i] > list[i + 1]) {
				isSorted = false;
				break;
			}
		} 
		return isSorted;
	}
}

