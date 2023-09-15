package assignments;

import java.util.Scanner;

public class AverageOfEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        double sum = 0;
        int negative = 0;
        double average = 0;


        while (counter <= 9) {
            System.out.println("Enter student scores: ");
            int number = input.nextInt();
            counter = counter + 1;
            if (number % 2 == 0) {
                sum = sum + number;
                negative = negative + 1;
            }

        }
        average = sum/negative;
        System.out.printf("Average of even: %.1f%n ",average);
    }
}
