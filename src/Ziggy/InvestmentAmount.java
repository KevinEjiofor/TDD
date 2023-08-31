package Ziggy;

import java.util.Scanner;

public class InvestmentAmount {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years:  ");
        int year = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double futureInvestmentValue =  investment * Math.pow(1 + monthlyInterestRate, year*12);

        System.out.printf("Accumulated value is $ %.2f",futureInvestmentValue);


    }
}
