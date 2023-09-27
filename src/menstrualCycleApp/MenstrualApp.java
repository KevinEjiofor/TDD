package menstrualCycleApp;

import Ziggy.CustomerException;

import javax.swing.*;

public class MenstrualApp {
    private final MenstrualCycle cycles = new MenstrualCycle();
    
    private String userName = " ";
    
    private String password;

    public static void main(String[] args) {
        MenstrualApp app = new MenstrualApp();
        app.welcomePage();
    }

    public void welcomePage(){
        try {
            String login = inputMethod("""
                        Enter:
                            
                            1->  Home page
                            
                            2->  Exit App
                            
                           
                            
                                
                            """);
            if (login != null && !login.isEmpty()){
                switch (login.charAt(0)) {
                    case '1' -> createAnAccount();

                    case '2' -> exitApp();
                }
            }else {
                throw new CustomerException("Invalid input. Please enter '1 - 3'");
            }
        } catch (CustomerException e) {
            displayMethod(e.getMessage());
            welcomePage();
        }

    }

    private void exitApp() {
        try {

            String user = inputMethod("Do you want to EXIT the app? Enter Yes/No: ").toLowerCase();


            switch (user) {
                case "yes" ->
                        displayMethod("Bye !");


                case "no" -> welcomePage();

                default -> throw new IllegalArgumentException("Invalid input. Please enter 'YES / NO'. ");


            }

        }catch (IllegalArgumentException error){
            displayMethod(error.getMessage());
            exitApp();
        }

    }



    private void createAnAccount() {
        try {
            String user = inputMethod("What name do you want to be called:  ");
            validateInputLetter(user);

            userName = user;
//
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MMM - yyyy");
//
            String yearOfBirth = inputMethod("Kindly enter your year of birth : ");
            fourDigitNumber(yearOfBirth);

        } catch (CustomerException e) {
            displayMethod(e.getMessage());
            welcomePage();
        }
    }
    private void validateInputLetter(String letter) throws CustomerException {
        String pattern = "^\\D+$*";

        if (!letter.matches(pattern)) throw new CustomerException("Invalid entry");
    }
    private void fourDigitNumber(String input) throws CustomerException {
        String pattern = "\\d{4}";

        if (!input.matches(pattern)) throw new CustomerException("Invalid year of birth");
    }
    private void validateNumbers(String numbers) throws CustomerException {

        String pattern = "^\\d+$*";
        if (!numbers.matches(pattern)) throw new CustomerException("invalid entry");
    }

    private String inputMethod(String prompt){return JOptionPane.showInputDialog(null,prompt);}

    private void displayMethod(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }


   
}
