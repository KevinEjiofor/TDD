package Assignments;

import java.util.Scanner;

public class PasswordValidation {
    private String password;
    private final Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        PasswordValidation UserEntry = new PasswordValidation();
        UserEntry.UserEntry();

    }
    public void UserEntry() throws InterruptedException {

        System.out.print("\nEnter password: ");
        String user = input.next();
        password = user;

        Conditions(user);
    }
    public void Conditions(String user) throws InterruptedException {

        if (user.length() < 8) {
            System.out.print("\nYour password is too short ");


        }
        if (!user.matches(".*[A-Z].*")) {
            System.out.print("\nkindly start with uppercase letters to your password ");
            UserEntry();

        }

        if (!user.matches(".*[a-z].*")) {
            System.out.println("\nkindly add lowercase letters to your password ");
            UserEntry();
        }

        if (!user.matches(".*[0-9].*")) {
            System.out.println("\nkindly add digits to your password");
            UserEntry();

        }
        if (!user.matches(".*[#?!@$%^&*-].*")) {
            System.out.println("\nKindly add special character (#?!@$%^&*-)");
            UserEntry();
        }
        else {

            Password_validation();
            System.out.print("Valid");
            save();
        }

    }
    public void Password_validation()  {
        System.out.print("\nKindly enter password again: ");
        String userX = input.next();

         if ( !password.equals(userX) ) {
             System.out.println("\nPassword don't match, please try again ");
             Password_validation();
         }

    }
    public void save() throws InterruptedException {

        System.out.println("\nSaving");
        for(int index = 0; index < 30; index++)   {
            System.out.print(">");
            Thread.sleep(30);
        }
        System.out.println("\nSaved successfully");

    }
}
