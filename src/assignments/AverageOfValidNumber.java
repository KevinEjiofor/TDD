package assignments;

import java.util.Scanner;

public class AverageOfValidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double sum = 0;


        while (counter <= 9) {

            System.out.println("Enter student scores: ");
            double number = input.nextDouble();


            if (number >= 0 && number <= 100) {
                sum = sum + number;
                counter = counter + 1;
            }


        }
        double average = sum / counter;
        System.out.printf("Average: %.1f  ", average);

    }
}
