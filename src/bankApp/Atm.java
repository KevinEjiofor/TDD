package bankApp;

import Ziggy.CustomerException;

import javax.swing.*;
import java.util.Objects;


public class Atm {
    private final Bank ziggyAtm = new Bank();

    public static void main(String[] args) {
        Atm ziggyAtm = new Atm();
        ziggyAtm.welcome_page();

    }

    public void welcome_page() {
        try {
            String welcome_display = inputMethod("""
                            
                            
                               WELCOME TO ZIGGY XCHANGE
                            
                                Enter:
                                        
                                      
                                      1-> Register Account 

                                      2-> Transaction section 

                                      3-> Exit 
                                              
                           """);

            switch (welcome_display) {
                case "1" -> bankRegistration();
                case "2" -> bankTransaction();
                case "3" -> exit();
                default ->
                        throw new CustomerException("Invalid input. Please enter '1 - 3' to create a diary account.");
            }



        } catch (CustomerException error) {
            displayMethod(error.getMessage());
            welcome_page();

        }
    }

    private void bankRegistration() {
        try {

           String userName = inputMethod("Kindly enter your first name: ");
           validateInputLetter (userName);

           String surname = inputMethod("Kindly enter your last name: ");
           validateInputLetter (surname);

           String payment = inputMethod("Enter pin (four digit pin): ");
            pin(payment);

            String accountNumber = ziggyAtm.generateAccountNumber();


            ziggyAtm.registerAnAccount(userName,surname,payment);

            String result ="\nAccount Name: "+ userName+ " " + surname +"\n\nAccount Number: "
                    + accountNumber +"\n\nAccount created successfully! \n\n\n\tBASE ON BELIEVE";

            displayMethod(result);
            welcome_page();

        }catch (CustomerException error){
            displayMethod(error.getMessage());
            welcome_page();
        }
    }



    private void exit() {
        try {
            String user = inputMethod("Do you want to EXIT the diary? Enter Yes/No: ").toLowerCase();

            switch (user) {
                case "yes" ->
                        displayMethod("Bye !");

                case "no" -> welcome_page();

                default -> throw new IllegalArgumentException("Invalid input. Please enter 'YES / NO' to create a diary account.");

            }
        } catch (IllegalArgumentException error) {
            displayMethod(error.getMessage());
            exit();
        }
    }


    private void bankTransaction() {
        try {
                String menu = inputMethod("""
                         Enter:
                                    
                                    1-> Balance
                                     
                                    2-> Deposit\s
                                    
                                    3-> Withdraw
                                    
                                    4-> Transfer
                                                                
                                    5-> Home Page  \s
                                    """) ;


            switch (menu) {
                case "1" -> balance();
                case "2" -> deposit();
                case "3" -> withdraw();
                case "4" -> transfer();
                case "5" -> homePage();
                default -> throw new CustomerException("Invalid input. Please select a valid option (1-5).");
            }


        }catch(CustomerException error) {
            displayMethod(error.getMessage());
            bankTransaction();

        }
    }

    private void homePage() {
        welcome_page();
    }

    private void transfer() {
        try {
            String senderAccountNumber = inputMethod("Enter your Sender account number: ");
            validateInputNumber(senderAccountNumber);

            String receiverAccountNumber = inputMethod("Enter your Sender account number: ");
            validateInputNumber(senderAccountNumber);

            String amount = inputMethod("Enter amount: ");
            validateInputNumber(amount);

            String pin = inputMethod("Enter your pin: ");
            pin(pin);

            ziggyAtm.transfer(senderAccountNumber,receiverAccountNumber, Double.parseDouble(amount),pin);
            displayMethod("Your transaction was successful");
            bankTransaction();

        }catch (CustomerException error){
            displayMethod(error.getMessage());
            bankTransaction();
        }




        }

    private void withdraw() {
        try {
            String accountNumber = inputMethod("Enter your account number: ");
            validateInputNumber(accountNumber);

            String amount = inputMethod("Enter amount: ");
            validateInputNumber(amount);

            String pin = inputMethod("Enter your pin: ");
            pin(pin);

            ziggyAtm.withdraw(accountNumber, Double.parseDouble(amount),pin);
            displayMethod("Your transaction was successful");
            bankTransaction();


        }catch (CustomerException error){
            displayMethod(error.getMessage());
            bankTransaction();
        }

        
    }

    private void deposit() {
        try {
            String accountNumber = inputMethod("Enter your account number: ");
            validateInputNumber(accountNumber);

            String amount = inputMethod("Enter amount: ");
            validateInputNumber(amount);

            ziggyAtm.deposit(accountNumber, Double.parseDouble(amount));
            displayMethod("Your transaction was successful");
            bankTransaction();

        }catch (CustomerException error){
            displayMethod(error.getMessage());
            bankTransaction();
        }
    }

    private void balance() throws CustomerException {
        try {
            String accountNumber = inputMethod("Enter account number: ");
            validateInputNumber(accountNumber);

            String pin = inputMethod("Enter pin: ");
            pin(pin);
           double amount = ziggyAtm.getBalance(accountNumber, pin);

           String message = "Your current balance is " + amount ;

           displayMethod(message);
           bankTransaction();



        }catch (CustomerException error){
            displayMethod(error.getMessage());
            bankTransaction();
        }
    }
    private String inputMethod(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }

    private void displayMethod(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
    private void pin(String payment) throws CustomerException {
        String pattern = "^\\d{4}$";
        if (!payment.matches(pattern)) throw new CustomerException("pin must four digits");
    }

    private void validateInputNumber(String number) throws CustomerException {
        String pattern = "^\\d+$*";

        if (!number.matches(pattern)) throw new CustomerException("Invalid number");
    }

    private void validateInputLetter(String letter) throws CustomerException {
        String pattern = "^\\D+$*";

        if (!letter.matches(pattern)) throw new CustomerException("Invalid entry");
    }
}