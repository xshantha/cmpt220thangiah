/*	Shantha Thangiah
	Lab 1: Writing Java Programs / Problem 1.4
	CMPT220 Software Development I */

public class lab1pb14{

	public static void main(String[] args) {
		// Declaring an integer variable "a" with 0 value
		int a = 0;
		System.out.println("Lab 1: Problem 1.4\n"); // Prints title
		System.out.println("a\ta^2\ta^3"); // Prints column heading with tab space

        while(a < 4) { // The while loop exits when "a" is greater than 4
    		++a; // Variable "a" is increased by 1. Equivalent to a=a+1
    		System.out.println(a +"\t"+ a*a +"\t"+  a*a*a);
    		// Prints value of variable "a", tab, a exponent 2, tab, a exponent 3
        }
	}
}
