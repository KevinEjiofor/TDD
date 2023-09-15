package bankAppTest;

import Ziggy.CustomerException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import bankApp.Account;
import bankApp.Bank;

import static org.junit.jupiter.api.Assertions.*;


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
        assertEquals(new Account("1","Ziggy Gad","pin"),bank.findAccount("1"));


    }

    @Test
    public  void testingForDeposit() throws CustomerException {
        double accountBalance = bank.getBalance("1","pin");
        assertEquals(0,accountBalance);

        bank.deposit( "1",5_000);

        double newAccountBalance = bank.getBalance("1","pin");
        assertEquals(5_000,newAccountBalance);

    }
    @Test
        public void testingForDepositingNegativeNumber() throws CustomerException {
        double accountBalance = bank.getBalance("1","pin");
        assertEquals(0,accountBalance);

        bank.deposit("1",-5000);

        double newAccountBalance = bank.getBalance("1","pin");
        assertEquals(0,newAccountBalance);
    }
    @Test
        public void testingForWithdraw() throws CustomerException {
        double accountBalance = bank.getBalance("1","pin");
        assertEquals(0,accountBalance);

        bank.deposit("1",5000 );
        bank.withdraw("1",2000,"pin");

        double newAccountBalance = bank.getBalance("1","pin");
        assertEquals(3_000,newAccountBalance);

    }
    @Test
    public void testingForWithdrawingAboveBalance() throws CustomerException {

        double accountBalance = bank.getBalance("1","pin");
        assertEquals(0,accountBalance);

        bank.deposit( "1",5000);


        assertThrows(CustomerException.class, () -> bank.withdraw("1",24000,"pin"));


    }
    @Test
        public void testingForTransfer() throws CustomerException {

        bank.deposit("1" ,5000);

        bank.registerAnAccount("Ejiro","Gad","8989");
        assertEquals(new Account("2","Ejiro Gad","8989"),bank.findAccount("2"));

        bank.transfer("1","2",2000,"pin" );

       double senderBalance = bank.getBalance("1","pin");
       double receiverBalance = bank.getBalance("2","8989");

       assertEquals(3000, senderBalance);
       assertEquals(2000,receiverBalance);

    }





}
