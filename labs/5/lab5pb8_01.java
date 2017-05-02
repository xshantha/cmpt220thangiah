/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 8.1
 * This program to sum elements column by column
 */

import java.util.Scanner;

public class lab5pb8_01 {
	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 8.1\n"); // This is to display the lab and pb numbers

 
		double[][] matrix = new double[3][4];
		java.util.Scanner input = new Scanner(System.in);
		
		// Prompt message for user to enter data
		System.out.println("Enter a 3-by-4 matrix row by row: ");
			
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					matrix[row][column] = input.nextDouble();
				}
			}
 
			
			for (int column = 0; column < matrix[0].length; column++) {
				System.out.println("Sum of the elements at column " + column
						+ " is " + sumColumn(matrix, column));
			}
	}
 

	public static double sumColumn(double[][] m, int columnIndex) {
 		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;
	}
}
