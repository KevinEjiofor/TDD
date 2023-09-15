package assignments;

import java.util.Arrays;
import java.util.Scanner;
public class EnforcingPrivacy {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int[] numbers = new int[4];


        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.print("Enter element: ");
            int entry = input.nextInt();
            numbers[counter] = entry;
            numbers[counter] += 7;

            numbers[counter] %= 10;




         }

//        int first = numbers[0]; int second = numbers [2];
//
//        int tem = numbers[first];
//
//        numbers [first] = numbers[second];
//        numbers[second] = tem;
//
//        numbers[0] = numbers [2];

        System.out.println(Arrays.toString(numbers));


    }



    }

