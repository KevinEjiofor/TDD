package tdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void canDepositIntoAccount(){
        Account ziggyAccount = new Account("0560946397","Ziggy","8989");
        int currentBalance = ziggyAccount.getBalance("8989");
        assertEquals(0, currentBalance) ;

        ziggyAccount.deposit(5000);

        int newBalance = ziggyAccount.getBalance("8989") ;
        assertEquals(5000, newBalance) ;

    }
    @Test
    public void canDepositTwistTest() {
        Account ziggyAccount = new Account("0560946397","Ziggy","8989");

        ziggyAccount.deposit(5000);

        int currentBalance = ziggyAccount.getBalance("8989");
        assertEquals(5000, currentBalance);

        ziggyAccount.deposit(2000);

        int newBalance = ziggyAccount.getBalance("8989");
        assertEquals(7000, newBalance);
    }
    @Test
    public void cannotDepositNegativeValueTest() {
        Account ziggyAccount = new Account("0560946397","Ziggy","8569");
        ziggyAccount.deposit(2000);

        int currentBalance = ziggyAccount.getBalance("8569");
        assertEquals(2000, currentBalance);

        ziggyAccount.deposit(-1000);

        int newBalance = ziggyAccount.getBalance("8569");
        assertEquals(2000, newBalance);
    }

@Test
    public void withdrawalTest(){
        Account ziggyAccount = new Account ("0560946397","Ziggy","8989");
        ziggyAccount.deposit( 5000);
        int currentAmount = ziggyAccount.getBalance("8989");
        assertEquals(5000, currentAmount);

        ziggyAccount.withdraw(3000,"8989");

        int newBalance = ziggyAccount.getBalance("8989");
        assertEquals(2000, newBalance);


    }

    @Test
    public void withdrawWithPinTest (){
        Account ziggyAccount = new Account ("0560946397","Ziggy","8989");
                ziggyAccount.deposit( 5000);

              int currentAmount = ziggyAccount.getBalance("8989");
                assertEquals(5000,currentAmount);

                ziggyAccount.withdraw(3000, "8989");

                int newBalance  =  ziggyAccount.getBalance("8989");
                assertEquals( 2000, newBalance);

    }


            @Test
                public void withdrawAboveBalanceAmountTest(){
                    Account ziggyAccount = new Account("0560946397","Ziggy","8989") ;
                    ziggyAccount.deposit(5000);

                    int currentBalance = ziggyAccount.getBalance("8989");
                    assertEquals(5000, currentBalance);

                    ziggyAccount.withdraw(100000,("8989"));

                    int newBalance = ziggyAccount.getBalance("8989");
                    assertEquals(5000, newBalance);
            }

            @Test
                public void changePin(){
                    Account ziggyAccount = new Account("0560946397","Ziggy","8989") ;

                    ziggyAccount.updatePin("9595","9595");

                    ziggyAccount.deposit(5000);

                    int newPinToCheckAccountBalance = ziggyAccount.getBalance("9595");
                    assertEquals(5000, newPinToCheckAccountBalance);







                }

    }





