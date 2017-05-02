/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.11
 * Algebra: 2 x 2 linear equations. ref ex.3.3
 */

import java.util.Scanner;

public class lab6pb9_11 {
    
    public static void main(String[] strings) {
    	System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 6, Problem 5.1\n"); // This is to display the lab and pb numbers
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation linear = new LinearEquation(a, b, c, d, e, f);

        if (linear.isSolvable()) {
            System.out.println("x is " + linear.getX() + " and y is " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}
