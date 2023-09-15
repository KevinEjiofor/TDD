package assignments;

import java.util.Scanner;

public class AverageGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        double average;

        while(counter < 10){
            System.out.print("Enter student scores: ");
            int number = input.nextInt();
            sum = sum + number;
            counter++;

        }
        average =  sum / counter;
        System.out.printf("%.1f%n  ",average);
    }
}
