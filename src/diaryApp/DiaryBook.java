package diaryApp;

import Ziggy.CustomerException;

import javax.swing.*;
import java.util.InputMismatchException;




public class DiaryBook {

    private String userName;
    private String password;
    private final Diaries diaries = new Diaries();

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
                                        
                    2. log in
                                        
                    3. Exit

                    """);


                if (welcomePage != null && !welcomePage.isEmpty()) {
                    if (welcomePage.equals("1")) diaryUserRegister();

                    else if (welcomePage.equals("2")) login();

                    else if (welcomePage.equals("3")) exitMenu();

                } else {
                    throw new IllegalArgumentException("Invalid input. Please enter '1 - 3'");
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
                case "yes" ->
                    displayMethod("Bye !");


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
            this.userName=user;
            this.password = userPassword;



            diaries.findUser(user).unLock(userPassword);
            mainMenu();



        }catch (CustomerException error){
        displayMethod(error.getMessage());
        displayWelcomePage();
        }
    }




    private void diaryUserRegister() {

        try {

            String userName = inputMethod("Kindly enter your name:  ");
            validateInputLetter(userName);
            String password = inputMethod("Enter a password: ");

            if (userName.isEmpty() || password.isEmpty())
                throw new InputMismatchException("Username and password cannot be empty.");

            diaries.addNewUser(userName, password);

            displayMethod("Diary created successfully!");
            displayWelcomePage();

        } catch (InputMismatchException | CustomerException error) {
            displayMethod(error.getMessage());
        }
    }


    private void mainMenu() {
        try {
            String menu = inputMethod(""" 
                   
                    1. Create entry
                                        
                    2. Update entry
                                        
                    3. Delete entry
                                        
                    4. Search for entry
                                        
                    5. Log out
                    """);
            switch (menu.charAt(0)) {
                case '1'->  createEntry();

                case '2' -> updateEntry();

                case '3' -> deleteEntry();

                case '4' -> findId();

                case '5' -> logout();
                default -> throw new CustomerException("Invalid input. Please select a valid option (1-6).");
            }

        } catch (CustomerException error) {
            displayMethod(error.getMessage());
            mainMenu();
        }


    }



    private void logout() throws CustomerException {
        diaries.findUser(userName).lockDiary();
        displayWelcomePage();
    }


    private void findId() {
            try {

                int diaryId = Integer.parseInt(inputMethod("Enter ID number: "));

                Entry entry = null;

                if (diaryId != 0)
                    entry = diaries.findUser(userName).findEntry(diaryId);
                if (entry != null)
                    displayMethod("Diary with ID" + diaryId + "found: " + entry.getTitle() + "\n" + entry.getBody());
                mainMenu();


            }catch (CustomerException Error) {
                displayMethod(Error.getMessage());
                mainMenu();
            }

    }




    private void deleteEntry() throws CustomerException {
        try {

            int entryId = Integer.parseInt(inputMethod("Enter ID: "));

            if (entryId != 0) {
                diaries.findUser(userName).deleteEntry(entryId);
                displayMethod("Diary with "+ entryId +"has been detected");
                mainMenu();
            }else {
                throw new CustomerException("User not found.");
            }

        }catch (CustomerException e) {
            displayMethod(e.getMessage());
            deleteEntry();
        }

    }

    private void updateEntry() throws CustomerException {
        try {
            int entryId = Integer.parseInt(inputMethod("Enter id: "));

            Entry entry = diaries.findUser(userName).findEntry(entryId);

            displayMethod("Diary with ID" + entryId + "found: " + entry.getTitle() + "\n" + entry.getBody());

            String title = inputMethod("update title: ");
            String body = inputMethod("update body: ");

            diaries.findUser(userName).updateEntry(entryId, title, body);
            displayMethod("Entry updated successfully.");
            mainMenu();


        }catch(CustomerException error) {
            displayMethod(error.getMessage());
        }
    }

    private void createEntry() {
        try {

            String title = inputMethod("Title: ");
            String body = inputMethod("body: ");

            if (title.isEmpty() || body.isEmpty()) {
                throw new InputMismatchException("Title or body cannot be empty.");
            }
            diaries.findUser(userName).createEntry(title, body);
            mainMenu();

        } catch (InputMismatchException | IllegalStateException | CustomerException error) {
            displayMethod(error.getMessage());
            createEntry();


        }
    }
    
    private String inputMethod(String prompt){return JOptionPane.showInputDialog(null,prompt);}

    private void displayMethod(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }

    private void validateInputLetter(String letter) throws CustomerException {
        String pattern = "^\\D+$*";

        if (!letter.matches(pattern)) throw new CustomerException("Invalid entry");
    }
}
