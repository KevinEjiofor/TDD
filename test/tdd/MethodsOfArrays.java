package tdd;

import java.util.Scanner;

public class MethodsOfArrays {
    private final static Scanner input = new Scanner(System.in);

    public static void largestNumber(int... numbers) {
         int max = numbers[0];

        for (int counter = 0; counter < numbers.length; counter++) {

            if (numbers[counter] > max) {
                max = numbers[counter];
            }

        }
    }
    public static  double largestNumber(double... numbers) {
        double max = numbers[0];

        for (int counter = 0; counter < numbers.length; counter++) {

            if (numbers[counter] > max) {
                max = numbers[counter];
            }

        }
        return max;
    }






    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int userInput = input.nextInt();

        double[] numbers = new double[userInput];


        for (int counter = 0; counter < userInput; counter++) {
            System.out.print("Enter Element in number: ");
            double numberList = input.nextDouble();

            numbers[counter] = numberList;

        }
        double largest = largestNumber(numbers);
        System.out.println("The largest number = " + largest );

    }

}