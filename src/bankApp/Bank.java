package bankApp;


import java.util.ArrayList;
import java.util.List;

import Ziggy.CustomerException;

public class Bank {
    String bankNumber = String.valueOf(new ArrayList<>());

    private String fullName;


    private final List<Account> accounts = new ArrayList<>();


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
        throw new IllegalStateException("Account not found");
    }

    public double getBalance(String accountNumber,String pin) throws CustomerException {
        return findAccount(accountNumber).getBalance(pin);

    }

    public void deposit(String accountNumber,double amount) {

            findAccount(accountNumber).deposit(amount);


    }

    public void withdraw(String accountNumber,double amount,  String pin) throws CustomerException {


            findAccount(accountNumber).withdraw(amount,pin);
    }


    public void transfer(String senderAccount, String receiverAccount, double amount, String pin) throws CustomerException {
             findAccount(senderAccount).withdraw(amount,pin);
             findAccount(receiverAccount).deposit(amount);


    }
}

