package tdd;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
    String bankNumber = String.valueOf(new ArrayList<>());

    private String fullName;
    private double balance;

    private String pin;

    private List<Account> accounts = new ArrayList<>();


    public void registerAnAccount(String firstName, String lastName, String pin) {
        Account account = new Account(generateAccountNumber(), firstName + " " + lastName, pin);
        accounts.add(account);
        this.fullName = firstName + " " + lastName;


    }

    private String generateAccountNumber() {
        return accounts.size() + 1 + "";
    }

    public String getFullName() {
        return fullName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    public List<Account> getAccountDetails() {
        return accounts;
    }

    public Account findAccount(String accountNumber) {
        for (Account accountDetails : accounts) {
            if (accountDetails.getAccountNumber().equals(accountNumber)) {
                return accountDetails;
            }

        }
        throw new IllegalStateException("Account not find");
    }

    public double getBalance(String pin) {

        return balance;

    }

    public void deposit(double amount, String accountNumber) {
        if (amount > 0) {
            findAccount(accountNumber).deposit((int) (balance += amount));
        }

    }

    public void withdraw(int amount, String accountNumber, String pin) {

        if (balance > amount) {
            findAccount(accountNumber).withdraw((int) (balance -= amount), pin);
        }
    }

}

