/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.13
 * This program prompt user to enter array size and contents, pass them to Location class 
 * for manupulation. Then extract the data and displays largest element and its array location.
 */

import java.util.Scanner;
public class lab6pb9_13 {
    
    public static void main(String[] args) {
    	
    	System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 6, Problem 9.13\n"); // This is to display the lab and pb numbers

        Scanner input = new Scanner(System.in);
        // Prompt user to enter number of rows and columns for the array
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];
        
        // Prompt user to enter values for the array elements
        System.out.println("Enter the array:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        // Mapping location to the Location class
        Location location = Location.locateLargest(m);

        // extract row, column, and max value from Location class to display
        System.out.println("The location of the largest element is "
                + location.maxValue + " at (" + location.row + ", " + location.column + ")");           
    }
}


