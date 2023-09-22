package bankApp;

import Ziggy.CustomerException;

import javax.swing.*;



public class Atm {
    private final Bank ziggyAtm = new Bank();

    public static void main(String[] args) {

    }

    public void welcome_page() {
        try {
            String welcome_display = inputMethod(
                            "=".repeat(50) +
                            
                                                  "  WELCOME TO ZIGGY XCHANGE" +
                            "=".repeat(50)    +
                               " Enter:" +
                                            " 1-> Register Account  "+

                                            " 2-> Transaction section   "+

                                           "  3-> Exit  "
                                              
                           );

            switch (welcome_display.charAt(0)) {
                case '1' -> bankRegistration();

                case '2' -> bankTransaction();

                case '3' -> exit();

                default -> throw new CustomerException("Invalid input. Please enter '1 - 3' to create a diary account.");
            }
        } catch (CustomerException error) {
            displayMethod(error.getMessage());
            welcome_page();

        }
    }

    private void bankRegistration() {
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

    private String inputMethod(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }

    private void displayMethod(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
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

                switch (menu.charAt(0)){
                    case '1' -> balance();
                    
                    case '2' -> deposit();
                    
                    case '3' -> withdraw();
                    
                    case '4' -> transfer();
                    
                    case '5' -> homePage();

                    default -> throw new CustomerException("Invalid input. Please select a valid option (1-5).");
                }


        }catch(CustomerException error) {
            displayMethod(error.getMessage());

        }
    }

    private void homePage() {
    }

    private void transfer() {
        
    }

    private void withdraw() {
        
    }

    private void deposit() {
        try {
            String accountNumber = inputMethod("Enter your account number: ");

            int amount = Integer.parseInt(inputMethod("Enter amount: "));


        }
    }

    private void balance() {
    }

    private void validateInputNumber(){

}
}