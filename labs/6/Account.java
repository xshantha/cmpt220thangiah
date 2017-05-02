/* Shantha Thangiah
 * CMPT220
 * Lab 6, Problem 9.7
 * This Account class to process calculations and return values back to main program
 */
import java.util.ArrayList;
import java.util.Date;
public class Account {
    
    protected int mId;
    protected double mBalance;
    protected double mAnnualInterestRate; 
    protected Date mDateCreated;

    public Account() {mDateCreated = new Date();}

    public Account(int id, double balance) {
        this();
        mId = id;
        mBalance = balance;
    }

    public int getId() { return mId;}
    public void setId(int id) {mId = id;}

    public double getBalance() {return mBalance;}
    public void setBalance(double balance) {mBalance = balance;}

    public double getAnnualInterestRate() {return mAnnualInterestRate;}
    public void setAnnualInterestRate(double annualInterestRate) {
        mAnnualInterestRate = annualInterestRate;}

    public Date getDateCreated() {return mDateCreated;}
    // Calculating monthly interest
    public double getMonthlyInterestRate() {return mBalance * (mAnnualInterestRate / 12) / 100;}
    // Withdraw amount is subtracted from mBalance
    public void withdraw(double amount) {mBalance -= amount;}
    // Deposited amount is added to the mBalance 
    public void deposit(double amount) {mBalance += amount;}

    @Override
    public String toString() {
        return "Interest rate: " + mAnnualInterestRate + "\n";
    }
}

