package tdd;

import java.util.Objects;

public class Account {
    private  String accountName;
    private int balance;
    private String PIN;
    private String accountNumber;

    public Account(String accountNumber, String accountName, String pin) {
        this.PIN = pin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;


    }


    public int getBalance(String pin) {
        if (!Objects.equals(PIN, pin)) throw new NullPointerException("Wrong Pin");
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }

    }


    public void withdraw(int amount ,String pin) {
        if (Objects.equals(PIN, pin)) {
            if (amount > 0) {
                if (amount < balance) {
                    balance -= amount;
                }
            }
        }
    }


    public void updatePin(String pin,String enterNewPinAgain ) {
        if (Objects.equals(pin, enterNewPinAgain)){
            PIN = pin;
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccount() {
        return accountNumber + " " + accountName + " " + PIN;
    }




}


