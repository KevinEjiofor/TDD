package tdd;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  counter = 0;
        int sum = 0;


        while( counter < 10){
            System.out.print("Enter student scores: ");
            int number = input.nextInt();
            counter = counter + 1;
            if (counter % 2 == 0){
                sum = sum + number ;
            }

        }
        System.out.printf("Sum of even index : %d%n ",sum);
    }


}
