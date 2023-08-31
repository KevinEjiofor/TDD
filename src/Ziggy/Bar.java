package Ziggy;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1;
        int number = 0;
        while (num <= 5) {
            System.out.print("Enter number between 1 to 30: ");
            number = input.nextInt();
            if (number >= 1 && number <= 30) {
                num += 1;
              
            }
            System.out.print("*".repeat(number));
        }

        System.out.println(number + "*");

    }

}
