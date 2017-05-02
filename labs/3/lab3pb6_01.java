/* Shantha Thangiah
 * CMPT220
 * Lab 3, Problem 6.1
 * A program uses method to display the first 100 pentagonal number with 10 numbers on each line
 */

import java.util.Scanner; 

public class lab3pb6_01{ 
	public static int getPentagonalNumber(int n){ 
		int pent = (n * (( 3 * n ) - 1 )) / 2; 
		return pent; 
		}
		
	public static void main(String[] args){
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
		System.out.println("Lab 3: Problem 6.1 \n"); // Displays the lab title
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer for the n pentagonal numbers to be displayed: "); 
		int x = input.nextInt();
		
		// Setting up variables
		int pent=0; 
		String pentNumbers = "";
	
		for (int i = 1; i <= x; i++ ){ 
			pent=getPentagonalNumber(i); 
			
			if (i % 10 == 0){ 
				pentNumbers+= Integer.toString(pent)+"\n"; 
			}
			
			else{ 
				pentNumbers+=Integer.toString(pent) +"\t"; 
				}  
		} 
	System.out.println(pentNumbers); // Display results
  } 
} 