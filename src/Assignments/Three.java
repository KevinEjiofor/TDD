package Assignments;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  counter = 0;
        double sum = 0;


        while( counter < 10){
            System.out.print("Enter student scores: ");
            int number = input.nextInt();
            sum = sum + number;
            counter = counter + 1;

        }
        double average = sum / counter;
        System.out.printf("Sum: %.0f%n Average: %.1f%n ",sum,average);
    }


}