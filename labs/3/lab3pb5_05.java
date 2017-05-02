/* Shantha Thangiah
 * CMPT220
 * Lab 3, Problem 5.5
 * This program to convert KG to LBS and LBS to KG
 */
public class lab3pb5_05 {

	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 3: Problem 5.5 \n"); // Displays the lab title
		System.out.println("Kilograms \t Pounds \t |\t Pounds \t Kilograms"); // Displays column heading 
		for(double i = 1, j = 20; i < 200; i += 2, j += 5) { // Conditional loop i is less than 200
			System.out.printf("%6.0f",i);	// Displays initial value of variable "i" then increased by 2
			System.out.printf("\t \t");	// Displays initial value of variable "i" then increased by 2
			System.out.printf("%5.1f",i*2.2);// Calculates Kg to Lbs and display
			System.out.print("\t \t |");	// Displays a vertical line of with pipe symbol		
			System.out.printf("\t%5.0f",j);  // Display initial value of variable "j" then increased by 5
			System.out.printf("\t\t%7.1f\n",j*(1/2.2)); // Calculate Kg from Lbs and displays 			
		} // End of the FOR loop
	} // End of main
} // End of lab3pb5_5