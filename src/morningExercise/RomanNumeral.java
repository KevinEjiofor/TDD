package morningExercise;

import java.util.Scanner;

import static java.lang.System.in;

public class RomanNumeral {
    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        System.out.println("enter: ");
        int word = input.nextInt();
        RomanNumeral roman = new RomanNumeral();
        System.out.println(roman.getRomanNumeralValue(word));

    }
    public String getRomanNumeralValue(int value) {

        StringBuilder romanNumeral = new StringBuilder();

        if (value < 1 || value > 3999) {
            throw new IllegalArgumentException("Value must be between 1 and 3999");
        }



        while (value >= 1000) {
            romanNumeral.append("M");
            value -= 1000;
        }
        while (value >= 900) {
            romanNumeral.append("CM");
            value -= 900;
        }
        while (value >= 500) {
            romanNumeral.append("D");
            value -= 500;
        }
        while (value >= 400) {
            romanNumeral.append("CD");
            value -= 400;
        }
        while (value >= 100) {
            romanNumeral.append("C");
            value -= 100;
        }
        while (value >= 90) {
            romanNumeral.append("XC");
            value -= 90;
        }
        while (value >= 50) {
            romanNumeral.append("L");
            value -= 50;
        }
        while (value >= 40) {
            romanNumeral.append("XL");
            value -= 40;
        }
        while (value >= 10) {
            romanNumeral.append("X");
            value -= 10;
        }
        while (value >= 9) {
            romanNumeral.append("IX");
            value -= 9;
        }
        while (value >= 5) {
            romanNumeral.append("V");
            value -= 5;
        }
        while (value >= 4) {
            romanNumeral.append("IV");
            value -= 4;
        }
        while (value >= 1) {
            romanNumeral.append("I");
            value -= 1;
        }


        String valueStr = romanNumeral.toString();

        return valueStr;
    }
}
