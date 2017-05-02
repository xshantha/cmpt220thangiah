/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.7
 * Carrying over data to Account class and process calculations and return values back to screen
 */
public class lab6pb9_07 {
    
    public static void main(String[] args) {
    	System.out.println("CMPT220 - Software Development I"); // This is to display the course ID
        System.out.println("Lab 6, Problem 9.7"); // This is to display the lab and pb numbers
        
    	Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        System.out.printf("\tAccount Balance: $%8.2f", account.getBalance());
        System.out.println("\n\tWithdrawing:      $2500.00");
        account.withdraw(2500);
        System.out.println("\tDepositing:\t  $3000.00");
        account.deposit(3000);

        System.out.println("\n\tACCOUNT DETAIL:");
        System.out.println("\t---------------");
        System.out.println("\tAccount ID............" + account.getId());
        System.out.printf("\tAccount Balance: $%8.2f", account.getBalance());
        System.out.printf("\n\tMonthly interest rate: %2.0f%%" , account.getMonthlyInterestRate());
        System.out.println("\n\tDate account was created: " + account.getDateCreated());
    }
}