/* Shantha Thangiah
 * CMPT220
 * Lab 5, Problem 7.11
 * This program to compute standard deviation (statistics)
 */
import java.util.Scanner;

public class lab5pb7_11 {

	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 5, Problem 7.11\n"); // This is to display the lab and pb numbers

		System.out.print("Enter ten numbers: "); // Prompts user to enter 10 numbers
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10]; // store input data
 
		// loop to store data in different elements
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
 
		System.out.printf("The mean is %5.2f", mean(numbers)); // prints mean
		System.out.printf("\nThe standard deviation is %8.5f", deviation(numbers)); // prints standard deviation

	}
	
	// standard deviation calculation
	public static double deviation(double[] x) {
		double mean = mean(x);
		double sumSq = 0;
  
		for (int i = 0; i < x.length; i++) {
			sumSq += Math.pow((x[i] - mean), 2);
		}
 		return Math.sqrt(sumSq / (x.length - 1));
	}
	
	// mean calculation
	public static double mean(double[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
}