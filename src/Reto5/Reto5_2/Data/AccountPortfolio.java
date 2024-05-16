package Reto5.Reto5_2.Data;

import java.util.ArrayList;

/**
 * This class represents a portfolio of account holders' accounts.
 */
public class AccountPortfolio {

    /**
     * Adds an account to the list of accounts in the portfolio.
     */
    public void addAccount(ArrayList<Account> accounts, Account account){
        accounts.add(new Account(account.totalSavings, account.accountNumber, account.owner));
    }

    /**
     * Displays the portfolio of accounts.
     */
    public void showPortfolio(ArrayList<Account> accounts){
        System.out.println(accounts);
    }
}
