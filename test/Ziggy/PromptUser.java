package Ziggy;

import java.util.Locale;
import java.util.Scanner;

public class PromptUser {

private final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        PromptUser run = new PromptUser();
        run.printingNumberInWords();

    }
    public void userName(){
        System.out.println("kindly enter your word: ");
        String user = input.next();


        if (user.matches("^\\D+$*")) {

            boolean isResult = palindrome(user);
            System.out.println(isResult);
        }
        else {
            System.out.println("invalid entry");
            userName();
        }


    }
    public void printingNumberInWords(){
        System.out.println("kindly enter your number: ");
        String user = input.next();

        if (user.matches("^\\d+$*")) {
            switch (user) {
                case "1" -> {
                    System.out.println("One");
                    return;
                }
                case "2" -> {
                    System.out.println("Two");
                    return;
                }

                case "3" ->{
                    System.out.println("Three");
                    return;
                }
                case "4" -> {
                    System.out.println("Four");
                    return;
                }
                case "5" -> {
                    System.out.println("Five");
                    return;
                }
                case "6" ->{
                    System.out.println("Six");
                    return;
                }
                case "7" -> {
                    System.out.println("Seven");
                    return;
                }
                case "8" ->{
                    System.out.println("Eight");
                    return;
                }
                case "9" ->{
                    System.out.println("Nine");
                    return;
                }
                case "10" -> {
                    System.out.println("Ten");
                    return;
                }

            }
            System.out.println("invalid entry");
            printingNumberInWords();

        }else {
            System.out.println("invalid entry");
            printingNumberInWords();
        }

    }
    public boolean palindrome(String word) {
        boolean isWord = false;
        String newList = "";
        for (int counter = 0; counter < word.length(); counter++) {
            char character = word.charAt((word.length() - 1) - counter);
            newList += character;
            if (word.equalsIgnoreCase(newList))isWord = true;
        }
        return  isWord;
    }


}
