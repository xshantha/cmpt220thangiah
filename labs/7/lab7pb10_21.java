/* Shantha Thangiah
 * CMPT220
 * Lab 7, Problem 10.21
 * Divisible by 5 or 6
 */
import java.math.BigDecimal;

public class lab7pb10_21 {
    
    public static void main(String[] args) {
		System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 7, Problem 10.21\n"); // This is to display the lab and pb numbers

        int count = 0;
        
        BigDecimal numero = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
        while (count < 10) {

            if (numero.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
            	numero.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
                count++;
                // This just to format the space for the column number tag
                if (count < 10){
                	System.out.print("\t " + count + ": ");
                } else {
                	System.out.print("\t" + count + ": ");                	
                }
                  System.out.println(numero);
            }
            numero = numero.add(BigDecimal.ONE);
        }
    }
}
