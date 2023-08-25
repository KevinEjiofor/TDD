package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {
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
        double accountBalance = bank.getBalance("pin");
        assertEquals(0,accountBalance);

        bank.deposit(5_000 ,"1");

        double newAccountBalance = bank.getBalance("pin");
        assertEquals(5000,newAccountBalance);

    }
    @Test
        public void testingForDepositingNegativeNumber(){
        bank.findAccount("1");
        double accountBalance = bank.getBalance("pin");
        assertEquals(0,accountBalance);

        bank.deposit(-5000, "1");

        double newAccountBalance = bank.getBalance("pin");
        assertEquals(0,newAccountBalance);
    }
    @Test
        public void testingForWithdraw(){
        bank.findAccount("1");
        double accountBalance = bank.getBalance("pin");
        assertEquals(0,accountBalance);

        bank.deposit(5000, "1");
        bank.withdraw(2000,"1","pin");

        double newAccountBalance = bank.getBalance("pin");
        assertEquals(3_000,newAccountBalance);

    }
    @Test
    public void testingForWithdrawingAboveBalance(){
        bank.findAccount("1");
        double accountBalance = bank.getBalance("pin");
        assertEquals(0,accountBalance);

        bank.deposit(5000, "1");
        bank.withdraw(24000,"1","pin");

        double newAccountBalance = bank.getBalance("pin");
        assertEquals(5000,newAccountBalance);


    }




}
