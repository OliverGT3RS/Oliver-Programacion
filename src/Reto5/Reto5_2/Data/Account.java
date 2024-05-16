package Reto5.Reto5_2.Data;

/**
 * This class represents an account with total savings, an account number, and an owner.
 */
public class Account {

    public double totalSavings;
    public int accountNumber;
    public String owner;

    /**
     * Constructor to initialize the Account object with total savings, account number, and owner.
     */
    public Account(double totalSavings, int accountNumber, String owner) {
        this.totalSavings = totalSavings;
        this.accountNumber = accountNumber;
        this.owner = owner;
    }
}
