/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 7.10
 * This program to identify and display the the smallest element and index
 */

import java.util.Scanner;

public class lab5pb7_10 {

	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 7.10\n"); // This is to display the lab and pb numbers

		Scanner input = new Scanner(System.in);
		double[] list = new double[10];

		for(int i = 0; i < list.length; i++){
		   System.out.printf("\tEnter a number for index %d : ", i);
		   // This loop is to display message for user to input numbers
		   list[i] = input.nextDouble();
		   // data stores in different elements
		}
		
		int ndxNum = indexOfSmallestElement(list);
		double smallNum = list[ndxNum];
		System.out.println();
		System.out.printf("The smallest element is %.2f and its index is %d.\n", smallNum, ndxNum);
		// This prints the smallest number and the index number along a message
}

	private static int indexOfSmallestElement(double[] myArray) {
		double currentValue = myArray[0];
		int smallestIndex = 0;
		
		// The follow is a loop to compare each element data to find the smallest
		for (int j = 1; j < 10 ; j++) {
		   if (myArray[j] < currentValue) {
			   currentValue = myArray[j];
			   smallestIndex = j;
		   }
		}  
		   
		return smallestIndex;
	}
}
