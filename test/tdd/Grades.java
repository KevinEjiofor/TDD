package tdd;

import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int  counter = 1;
       int sum = 0;

       while( counter < 10){
           System.out.println("Enter student scores: ");
           int number = input.nextInt();
           sum =sum + number;
           counter += 1;
       }

        System.out.printf("sum: %d",sum);
    }
}
