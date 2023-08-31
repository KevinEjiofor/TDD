package Assignments;

import java.util.Scanner;

public class InputOfEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;


        while (counter <= 9) {
            System.out.println("Enter student scores: ");
            int number = input.nextInt();
            counter = counter + 1;
            if (number % 2 == 0) {
                sum = sum + number;
            }

        }
        System.out.printf("Sum of even number: %d%n ", sum);
    }
}
