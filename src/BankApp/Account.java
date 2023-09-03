package BankApp;


import Ziggy.CustomerException;

import java.util.Objects;

public class Account {

    private final String accountName;
    private double balance;
    private String PIN;
    private final String accountNumber;



    public Account(String accountNumber, String accountName, String pin) {
        this.PIN = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;


    }


    public double getBalance(String pin) throws CustomerException {
        validatePin(pin);

        return  balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }

    }


    public void withdraw(double amount ,String pin) throws CustomerException {
        validatePin(pin);
        validate_amount(amount);
        balance = balance - amount;



    }


    public void updatePin(String pin,String enterNewPin ) throws CustomerException {
        validatePin(pin);
        PIN = enterNewPin;



    }

    public String getAccountNumber() {
        return accountNumber;
    }



    public String getAccount() {
        return accountNumber + " " + accountName + " " + PIN;
    }
    private void validatePin(String pin) throws CustomerException {
        if (!Objects.equals(PIN, pin)) {
            throw new CustomerException("Wrong Pin");
        }
    }
    private void validate_amount(double amount) throws CustomerException {
        if (amount > balance){throw new CustomerException("Insufficient fund");

        } else if (amount < 0) { throw new CustomerException("Amount can't be less than zero");

        }
    }



}


