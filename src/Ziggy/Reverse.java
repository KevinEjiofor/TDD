package Ziggy;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
   final static Scanner input = new Scanner(System.in);

    public static String reverse(int ... numbers){

        String newList = "";

        for(int counter = numbers.length - 1; counter >= 0; counter--){
            int another = numbers[counter];

                    newList += another + " ";
        }
        return newList;




    }
    public static void main(String[] args) {
        System.out.print("Enter array size:  ");
        int size = input.nextInt();

        int[] numbers = new int[size];


        for (int counter = 0; counter < size; counter++) {
            System.out.print("Enter element: ");
            int userEntry = input.nextInt();

            numbers[counter] = userEntry;
        }
        System.out.println(Arrays.toString(numbers));
        String result = reverse(numbers);
        System.out.println(result);
    }

}