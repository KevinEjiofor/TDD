package Assignments;

import java.util.Scanner;

public class DoLoop {
    public static int AddUp(int... number) {
        int total = 0;

        int counter = 0;
        do {{
            total += number[counter];
            counter++;

        }

        }
        while (counter < number.length) ;
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        int counter = 0;
        do {
            System.out.print("Enter element: ");
            int entry = input.nextInt();
            numbers[counter] = entry;
            counter++;
        }
        while (counter < size) ;

        int result = AddUp(numbers);
        System.out.print("sum of input: " + result);
    }
}