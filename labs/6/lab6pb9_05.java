/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.5
 *  
 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class lab6pb9_05 {

    public static void main(String[] args) {
    	
    	 System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
         System.out.println("Lab 6, Problem 9.5\n"); // This is to display the lab and pb numbers

        System.out.println(new Date().toString());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);
        
        System.out.printf("Year: %d Month: %d Day: %d",
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
    }
}