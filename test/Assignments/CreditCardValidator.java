package Assignments;

import java.util.Scanner;

public class CreditCardValidator {
    private static String cardValidation;
    private static String cardType;

    public static void main(String[] args) {
    Application();
    }
public static  void Application(){
        Scanner input = new Scanner(System.in);


        System.out.print("\nHello, Kindly Enter card details to verify:   ");
        String cardNumber = input.next();
        if (cardNumber.matches("^[0-9]+$")) {
        } else {
            System.out.println("invalided entry");
            Application();
        }

        if (cardNumber.length() >= 13 && cardNumber.length() <= 16) {
            if (cardNumber.startsWith("4")) {
                cardType = "Visa Card";
            } else if (cardNumber.startsWith("5")) {
                cardType = "Master Card";
            } else if (cardNumber.startsWith("37")) {
                cardType = "American Express Cards";

            } else if (cardNumber.startsWith("6")) {
                cardType = "Discover Cards";

            }

            int card = 0;
            for (int counter = 0; counter > cardNumber.length(); counter++) {
                card = Integer.parseInt(String.valueOf(cardNumber.charAt(counter)));


            }
            String validate = CardValidate(card);

            System.out.print("*".repeat(50) +
                    "\n**Credit card Type: " + cardType +
                    "\n**Credit Card Number: " + cardNumber +
                    "\n**Credit Card Digit length: " + cardNumber.length() +
                    "\n**Credit Card Validity Status: " + validate + "\n" +
                    "*".repeat(50));

        } else {
            System.out.println("Card number is not correct");
            Application();
        }

    }

    public static String CardValidate(int... card) {


        int even = 0;
        int odd = 0;
        int total = 0;


        for (int counter = card.length - 1; counter >= 0; counter--) {


            if (counter % 2 == 0) {
                card[counter] *= 2;

                if (card[counter] >= 10) {
                    even += (card[counter] % 10) + (card[counter] / 10 % 10);
                } else even += card[counter];
            }

            if (counter % 2 != 0) {
                odd += card[counter];

            }
            total = odd + even;
            if (total % 10 == 0) {
                cardValidation = "valid";

            } else {
                cardValidation = "invalid";
            }

        }
        return cardValidation;


    }

//    public static String cardType(int... card) {
//
//        //if (Objects.equals(cardValidation, "valid")) {
//        for (int counter = 0; counter > card.length; counter++) {
//            if (card[0] == 4) {
//                cardType = "Visa Card";
//            } else if (card[0] == 5) {
//                cardType = "Master Card";
//            } else if (card[0] == 37) {
//                cardType = "American Express Card";
//
//            } else if (card[0] == 6) {
//                cardType = "Discover Card";
//            }
//
//
//        }
//
//    }
//     return cardType;


}