/* Shantha Thangiah
 * CMPT220
 * Lab 7, Problem 10.5
 * Prime Factors
 */
import java.util.Scanner;

public class lab7pb10_05 {
  
	public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 7, Problem 10.5\n"); // This is to display the lab and pb numbers
        
        // Prompt for user input
        System.out.print("\tEnter a positive integer: ");
        int numero = new Scanner(System.in).nextInt();
        System.out.print("\n\tFactors for " + numero + " are ");
        // Creating StackOfInt object
        StackOfInt stack = new StackOfInt(20);

        int factor = 2;
        while (factor <= numero) {
            if (numero % factor == 0) {
            	// Push prime factor into stack
            	stack.push(factor);
                numero /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()+ ", ");
        }
    }
}
