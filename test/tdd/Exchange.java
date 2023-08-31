package tdd;

import java.util.Scanner;

public class Exchange {
    private double amount;
    private double rate;

        private static final Scanner input = new Scanner(System.in);



    public static void Convert() {
            System.out.print("Enter the exchange rate from dollar to RMB: ");
            double exchange = input.nextDouble();
            while (true) {
                System.out.print("Enter 0 to convert to dollar or 1 to convert to RMB: ");
                int num = input.nextInt();


                if (num == 0) {
                    System.out.print("Enter the dollar amount: ");
                    double dollar = input.nextDouble();
                    double amount = dollar * exchange;
                    System.out.printf("$ %.0f is %.1f yuan", dollar, amount);

                }


                if (num == 1) {
                    System.out.print("Enter the RMB amount: ");
                    double RMB = input.nextDouble();

                    double result = RMB / exchange;
                    System.out.printf("%.1f yuan is %.2f", RMB, result);
                }


            }
        }

    public static void main(String[] args) {
            Convert();


    }
    public void convert(int number) {
        if (number == 1)
            amount = rate * amount ;
        if (number == 0)
            amount = amount / rate;

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }


    public void setRate(double rate) {
        this.rate = rate;
    }
}




//public static int sum(int i1, int i2) {
//    int result = 0;
//    for (int i = i1; i <= i2; i++)
//        result += i;
//    return result;
//}
//    public static void main(String[] args) {
//        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
//        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
//        System.out.println("Sum from 35 to 49 is " + sum(35, 49));
//    }
//}