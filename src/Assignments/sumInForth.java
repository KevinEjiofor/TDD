package Assignments;

import java.util.Arrays;
import java.util.Scanner;



public class sumInForth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] numbers = new int[4][3];

        for (int counter = 0; counter < numbers.length -1; counter++) {
            for (int counter2 = 0; counter2 < numbers[counter].length  ; counter2++) {
                System.out.print("Enter element: ");
                int entry = input.nextInt();
                numbers[counter][counter2] = entry;
            }
        }


        numbers[3][0] = numbers[0][0] + numbers[1][0] + numbers[2][0];
        numbers[3][1] = numbers[0][1] + numbers[1][1] + numbers[2][1] ;
        numbers[3][2] = numbers[0][2] + numbers[1][2] + numbers[2][2] ;
        System.out.print(Arrays.deepToString(numbers));


        }

    }
