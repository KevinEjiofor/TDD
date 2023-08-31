package Assignments;

import java.util.Scanner;

public class ForLoop {
    public static int AddUp(int... number) {
        int total = 0;

        for (int counter = 0; counter < number.length; counter++) {
            total += number[counter];

        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int counter = 0; counter < size; counter++) {
            System.out.print("Enter element: ");
            int entry = input.nextInt();
            numbers[counter] = entry;
        }
        int result = AddUp(numbers);
        System.out.print("sum of input: "+ result);
    }
}


