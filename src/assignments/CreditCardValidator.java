package assignments;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CreditCardValidator {
    private static String cardValidation;
    private static String cardType;

    public static void main(String[] args) {
        Application();
    }

    public static void Application() {
        Scanner input = new Scanner(System.in);


        System.out.print("\nHello, Kindly Enter card details to verify:   ");
        String cardNumber = input.next();

        if (cardNumber.matches("^[0-9]+$")) {
        } else {
            System.out.println("invalid entry");
            Application();
        }
        if (cardNumber.length() >= 13  && cardNumber.length() <= 16) {

            int length = cardNumber.length();
            int[] card_Number = new int[length];

            int card ;
            for (int counter = 0; counter < cardNumber.length(); counter++) {
                card = Integer.parseInt(String.valueOf(cardNumber.charAt(counter)));

                if (counter == 0) {
                    card_Number[0] = card;
                }
                if (counter == 1) {
                    card_Number[1] = card;
                }
                if (counter == 2) {
                    card_Number[2] = card;
                }
                if (counter == 3) {
                    card_Number[3] = card;
                }
                if (counter == 4) {
                    card_Number[4] = card;
                }
                if (counter == 5) {
                    card_Number[5] = card;
                }
                if (counter == 6) {
                    card_Number[6] = card;
                }
                if (counter == 7) {
                    card_Number[7] = card;
                }
                if (counter == 8) {
                    card_Number[8] = card;
                }
                if (counter == 9) {
                    card_Number[9] = card;
                }
                if (counter == 10) {
                    card_Number[10] = card;
                }
                if (counter == 11) {
                    card_Number[11] = card;
                }
                if (counter == 12) {
                    card_Number[12] = card;
                }
                if (counter == 13) {
                    card_Number[13] = card;
                }
                if (counter == 14) {
                    card_Number[14] = card;
                }
                if (counter == 15) {
                    card_Number[15] = card;
                }

                if (card_Number[0] == 4) {
                    cardType = "Visa Card";

                } else if (card_Number[0] == 5) {
                    cardType = "Master Card";
                } else if (card_Number[0] == 3 && card_Number[1] == 7) {
                    cardType = "American Express cards";
                } else if (card_Number[0] == 6) {
                    cardType = "Discover cards";

                }
            }
            String validate = CardValidate(card_Number);
            if (Objects.equals(validate, "valid")) {

                System.out.print("*".repeat(50) +
                        "\n**Credit card Type: " + cardType +
                        "\n**Credit Card Number: " + cardNumber +
                        "\n**Credit Card Digit length: " + cardNumber.length() +
                        "\n**Credit Card Validity Status: " + validate + "\n" +
                        "*".repeat(50));
            } else {
                System.out.print("*".repeat(40) +
                        "\n**Credit card Type:  null" +
                        "\n**Credit Card Number: " + cardNumber +
                        "\n**Credit Card Digit length: " + cardNumber.length() +
                        "\n**Credit Card Validity Status: " + validate + "\n" +
                        "*".repeat(40));
            }
        }else {
            System.out.println("card number is  not correct ");
            Application();
        }
    }




    public static String CardValidate(int... card) {


        int even = 0;
        int odd = 0;
        int total ;


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


    public static class PositionOfArrays {
        int check;
        public int[] set;

        public static void main(String[] args) {
            int[] check = {5, 18, 32, 3, 4,};
            int[] position = new int[check.length];

            for (int index = 0; index < check.length; index++)
                position[index] = check[index];

            Arrays.sort(position);

            System.out.println(Arrays.toString(position));

            int[] newPosition = new int[check.length];

            for (int index = 0; index < check.length; index++) {
                for (int index2 = 0; index2 < position.length; index2++) {
                    if (check[index] > position[index2]) {


                    }


                }


            }

        }


    }
}