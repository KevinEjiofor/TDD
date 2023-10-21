package morningExercise;

import java.util.Scanner;

public class DecimalTOBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binary = decimalToBinary(decimalNumber);

        System.out.println("Binary representation: " + binary);
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}


