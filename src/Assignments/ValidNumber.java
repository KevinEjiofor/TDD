package Assignments;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  counter = 0;
        int sum = 0;


        while( counter <= 9){

            System.out.println("Enter student scores: ");
            int number = input.nextInt();


            if (number >= 0 && number <= 100) {
                sum = sum + number;
                counter = counter + 1;
            }


        }


    }
}

