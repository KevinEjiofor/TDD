package Ziggy;
import  java.util.Scanner;
public class Counting {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
       int counter = 0;
       int negatives = 0;
       int positives = 0;
       int total = 0;

        while (true) {

            System.out.print("Enter integer number or enter 0 to end:  ");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }

            total += number;
            counter = counter + 1;

            if (number > 0) {
                positives = positives + 1;
            }
            if (number < 0) {
                negatives = negatives + 1;
            }




        }

        double average =(double) total / counter;
            System.out.printf("Total: %d%nThe average: %.2f%nNumber of positives:%d%nNumbers of negatives:%d%n ",total,average, positives,negatives);



    }
}
