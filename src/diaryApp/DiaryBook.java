package diaryApp;

import Ziggy.CustomerException;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Objects;



public class DiaryBook {

    private String userName;
    private String password;
    private final Diaries diary = new Diaries();

    public static void main(String[] args) {
        DiaryBook caller = new DiaryBook();
        caller.displayWelcomePage();

    }

    private void displayWelcomePage() {

        try {
            String welcomePage = inputMethod(""" 
                                     WELCOME
                    LEAVING YOUR IMPACT FOR ETERNITY (LIFE)

                    1. Create a diary account
                                        
                    2. login account
                                        
                    3. Exit

                    """);
            switch (welcomePage.charAt(0)) {
                case '1' -> diaryUserRegister();

                case '2' -> login();

                case '3' -> exitMenu();

                default -> throw new IllegalArgumentException("Invalid input. Please enter '1 - 3' to create a diary account.");
            }
        } catch (IllegalArgumentException | CustomerException error) {
            displayMethod(error.getMessage());
            displayWelcomePage();
        }

    }

    private void exitMenu() {
        try {


            String user = inputMethod("Do you want to EXIT the diary? Enter Yes/No: ").toLowerCase();

            switch (user) {
                case "yes" -> {
                    displayMethod("Thank you for exiting");
                }

                case "no" -> displayWelcomePage();

                default -> throw new IllegalArgumentException("Invalid input. Please enter 'YES / NO' to create a diary account.");

            }
        }catch (IllegalArgumentException error){
            displayMethod(error.getMessage());
            exitMenu();
        }

    }

    private void login() throws CustomerException {
        try {
            String user = inputMethod("Enter user name: ");
            String userPassword = inputMethod("Enter password: ");
            if (!userName.equalsIgnoreCase( user)||!password.equals( userPassword)){
                throw new CustomerException("WRONG USER NAME OR PASSWORD");
            }
            diary.login(user, userPassword);
            mainMenu();

        }catch (CustomerException error){
        displayMethod(error.getMessage());
        login();
        }
    }




    private void diaryUserRegister() {

        try {

            String userName = inputMethod("Kindly enter your name:  ");
            String password = inputMethod("Enter a password: ");

            if (userName.isEmpty() || password.isEmpty()) {
                throw new InputMismatchException("Username and password cannot be empty.");
            }
            diary.addNewUser(userName, password);
            this.userName = userName;
            this.password = password;
            displayMethod("Diary created successfully!");
            displayWelcomePage();

        } catch (InputMismatchException | IllegalStateException error) {
            displayMethod(error.getMessage());
        }
    }


    private void mainMenu() {
        try {
            String menu = inputMethod(""" 
                   
                    1. Create entry
                                        
                    2. Update entry
                                        
                    3. Delete entry
                                        
                    4. Search
                                        
                    5. Lock diary
                                        
                    6. Unlock diary
                    """);
            switch (menu.charAt(0)) {
                case '1'->  createEntry();

                case '2' -> updateEntry();

                case '3' -> deleteEntry();

                case '4' -> findId();

                case '5' -> lockDiary();

                case '6' -> unlockDiary();

                default -> throw new CustomerException("Invalid input. Please select a valid option (1-6).");
            }

        } catch (CustomerException error) {
            displayMethod(error.getMessage());
        }


    }


    private void unlockDiary() throws CustomerException {
        try {


            String userPassword = inputMethod("Enter password: ");
            validatePin(userPassword);
            mainMenu();



        }catch (CustomerException error){
            displayMethod(error.getMessage());
            unlockDiary();
        }

    }

    private void lockDiary() {}

    private void findId() {
        try {
            int diaryId = Integer.parseInt(inputMethod("Enter ID number: "));
            diary.findUser(userName).findEntry(diaryId);
            mainMenu();

        } catch (CustomerException e) {
            displayMethod(e.getMessage());
            findId();
        }

    }

    private void deleteEntry() throws CustomerException {
        try {


            int entryId = Integer.parseInt(inputMethod("Enter ID: "));
            diary.findUser(userName).deleteEntry(entryId);
            mainMenu();

        }catch (CustomerException e) {
            displayMethod(e.getMessage());
            deleteEntry();
        }

    }

    private void updateEntry() {
        
    }

    private void createEntry() {
        try {

            String title = inputMethod("Title: ");
            String body = inputMethod("body: ");

            if (title.isEmpty() || body.isEmpty()) {
                throw new InputMismatchException("Title or body cannot be empty.");
            }
            diary.findUser(userName).createEntry(title, body);
            mainMenu();

        } catch (InputMismatchException | IllegalStateException | CustomerException error) {
            displayMethod(error.getMessage());
            createEntry();


        }
    }
    private void validatePin(String pin) throws CustomerException {
        if (!Objects.equals(password, pin)) {
            throw new CustomerException("WRONG PASSWORD");
        }
    }
    private String inputMethod(String prompt){return JOptionPane.showInputDialog(null,prompt);}

    private void displayMethod(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }
}
