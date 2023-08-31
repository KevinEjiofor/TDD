package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirCondition {
    private int temperature;
    private boolean isOn;


    public boolean getIsOn() {
        return isOn;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void increaseTemperature() {
        if (temperature < 30)
            temperature++ ;
    }



    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void decreaseTemperature() {
        if(temperature > 16 )
            temperature--;


    }

    public static class Account {
        private final String accountName;
        private double balance;
        private String PIN;
        private String accountNumber;

        public Account(String accountNumber, String accountName, String pin) {
            this.PIN = pin;
            this.accountNumber = accountNumber;
            this.accountName = accountName;


        }


        public double getBalance(String pin) {
            if (!Objects.equals(PIN, pin)) throw new NullPointerException("Wrong Pin");
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {

                balance = balance + amount;
            }

        }


        public void withdraw(double amount ,String pin) {
            if (PIN.equals(pin)) {
                if (amount > 0) {
                    if (amount < balance) {
                        balance = balance - amount;
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

    public static class AccountTest {

        @Test
        public void canDepositIntoAccount(){
            Account ziggyAccount = new Account("0560946397", "Ziggy","8989");
            double currentBalance = ziggyAccount.getBalance("8989");
            assertEquals(0, currentBalance) ;

            ziggyAccount.deposit(5000);

            double newBalance = ziggyAccount.getBalance("8989") ;
            assertEquals(5000, newBalance) ;

        }
        @Test
        public void canDepositTwistTest() {
            Account ziggyAccount = new Account("0560946397", "Ziggy","8989");

            ziggyAccount.deposit(5000);

            double currentBalance = ziggyAccount.getBalance("8989");
            assertEquals(5000, currentBalance);

            ziggyAccount.deposit(2000);

            double newBalance = ziggyAccount.getBalance("8989");
            assertEquals(7000, newBalance);
        }
        @Test
        public void cannotDepositNegativeValueTest() {
            Account ziggyAccount = new Account("0560946397", "Ziggy","8569");
            ziggyAccount.deposit(2000);

            double currentBalance = ziggyAccount.getBalance("8569");
            assertEquals(2000, currentBalance);

            ziggyAccount.deposit(-1000);

            double newBalance = ziggyAccount.getBalance("8569");
            assertEquals(2000, newBalance);
        }

    @Test
        public void withdrawalTest(){
            Account ziggyAccount = new Account("0560946397", "Ziggy","8989");
            ziggyAccount.deposit( 5000);
            double currentAmount = ziggyAccount.getBalance("8989");
            assertEquals(5000, currentAmount);

            ziggyAccount.withdraw(3000,"8989");

            double newBalance = ziggyAccount.getBalance("8989");
            assertEquals(2000, newBalance);


        }

        @Test
        public void withdrawWithPinTest (){
            Account ziggyAccount = new Account("0560946397", "Ziggy","8989");
                    ziggyAccount.deposit( 5000);

                  double currentAmount = ziggyAccount.getBalance("8989");
                    assertEquals(5000,currentAmount);

                    ziggyAccount.withdraw(3000, "8989");

                    double newBalance  =  ziggyAccount.getBalance("8989");
                    assertEquals( 2000, newBalance);

        }


                @Test
                    public void withdrawAboveBalanceAmountTest(){
                        Account ziggyAccount = new Account("0560946397", "Ziggy","8989") ;
                        ziggyAccount.deposit(5000);

                        double currentBalance = ziggyAccount.getBalance("8989");
                        assertEquals(5000, currentBalance);

                        ziggyAccount.withdraw(100000,("8989"));

                        double newBalance = ziggyAccount.getBalance("8989");
                        assertEquals(5000, newBalance);
                }

                @Test
                    public void changePin(){
                        Account ziggyAccount = new Account("0560946397", "Ziggy","8989") ;

                        ziggyAccount.updatePin("9595","9595");

                        ziggyAccount.deposit(5000);

                        double newPinToCheckAccountBalance = ziggyAccount.getBalance("9595");
                        assertEquals(5000, newPinToCheckAccountBalance);

                    }

        }

    public static class Bank {
        String bankNumber = String.valueOf(new ArrayList<>());

        private String fullName;
        private double balance;

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
            throw new IllegalStateException("Account not find");
        }
        public double checkBalance(String accountNumber, String pin) {
            return findAccount(accountNumber).getBalance(pin);
        }



        public void deposit(double amount, String accountNumber) {
            if (amount > 0) {
                findAccount(accountNumber).deposit(amount);
            }
        }
        public void withdraw(int amount, String accountNumber, String pin) {
            findAccount(accountNumber).withdraw(amount,pin);

        }

        public void transfer(double amount, String fromAccount, String transferToAccount , String pin) {
            if (amount > balance) {
                findAccount(fromAccount).withdraw(amount, pin);
                findAccount((transferToAccount)).deposit(amount);

            }

        }

    }

    public static class BankTest {
        Bank bank;
        @BeforeEach
        public void  startWith(){
        bank = new Bank();
        bank.registerAnAccount("Ziggy","Gad","pin");


    }

        @Test
        public void testForRegisterAnAccount() {
            String details = bank.getFullName();

            assertEquals("Ziggy Gad",details);
            assertEquals(1, bank.getNumberOfAccounts());
        }
        @Test

        public void testThatMultipleAccountsCanBeCreated(){

            bank.registerAnAccount("...", "...", "1212");
            String personNumber = bank.getBankNumber();
            assertEquals(2,bank.getAccountDetails().size(),personNumber );
        }
        @Test
        public void testingForGettingAccountNumber(){
            bank.registerAnAccount("Ziggy","Gad","pin");
            assertEquals(new Account("1","Ziggy Gad","pin").getAccount(),bank.findAccount("1").getAccount());


        }

        @Test
             public  void testingForDeposit(){
            bank.findAccount("1");
            double accountBalance = bank.checkBalance("1","pin");
            assertEquals(0,accountBalance);

            bank.deposit(5_000 ,"1");

            bank.findAccount("1");

            double newAccountBalance = bank.checkBalance("1","pin");
            assertEquals(5000,newAccountBalance);

        }
        @Test
            public void testingForDepositingNegativeNumber(){
            bank.findAccount("1");
            double accountBalance = bank.checkBalance("1","pin");
            assertEquals(0,accountBalance);

            bank.deposit(-5000, "1");
            bank.findAccount("1");
            double newAccountBalance = bank.checkBalance("1","pin");
            assertEquals(0,newAccountBalance);
        }
        @Test
            public void testingForWithdraw(){
            bank.findAccount("1");
            double accountBalance = bank.checkBalance("1","pin");
            Assertions.assertEquals(0,accountBalance);

            bank.deposit(5000, "1");
            bank.withdraw(2000,"1","pin");

            bank.findAccount("1");

            double newAccountBalance = bank.checkBalance("1","pin");
            assertEquals(3_000,newAccountBalance);

        }
        @Test
        public void testingForWithdrawingAboveBalance(){
            bank.findAccount("1");
            double accountBalance = bank.checkBalance("1","pin");
            assertEquals(0,accountBalance);

            bank.deposit(5000, "1");
            bank.withdraw(24000,"1","pin");

            bank.findAccount("1");

            double newAccountBalance = bank.checkBalance("1","pin");
            assertEquals(5000,newAccountBalance);


        }
        @Test
        public void testingForBankTransferInTheSameBank(){
            bank.findAccount("1");
            bank.registerAnAccount("Don", "John", "1212");
            assertEquals(new Account("2","Don John","1212").getAccount(),bank.findAccount("2").getAccount());
            bank.deposit(5000,"1");

            bank.transfer(2000,"1","2","pin");

            bank.findAccount("1");
            double newBalance = bank.checkBalance("1","pin");
            assertEquals(3000,newBalance);



            bank.findAccount("2");
            double newBalance2 = bank.checkBalance("2","1212");
            assertEquals(2000,newBalance2);

        }
    //    @Test
    //    public void testingForAmountAboveTheAccountBalanceFormBankTransferInTheSameBank(){
    //        bank.findAccount("1");
    //        bank.registerAnAccount("Don", "John", "1212");
    //        assertEquals(new Account("2","Don John","1212").getAccount(),bank.findAccount("2").getAccount());
    //        bank.deposit(5000,"1");
    //
    //        bank.transfer(7000,"1","2","pin");
    //
    //        bank.findAccount("1");
    //        double newBalance = bank.checkBalance("1","pin");
    //        assertEquals(5000,newBalance);
    //
    //        bank.findAccount("2");
    //        double newBalance2 = bank.checkBalance("2","1212");
    //        assertEquals(0,newBalance2);
    //
    //
    //    }
    //
    //


    }
}


