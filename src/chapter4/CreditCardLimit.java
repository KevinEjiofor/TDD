package chapter4;

import java.util.Scanner;

public class CreditCardLimit {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        creditCardLimit();

    }
    public static  void creditCardLimit(){
        System.out.println("How many customer: ");
        int numberOfCustomers = input.nextInt();

        for (int index = 1; index <= numberOfCustomers; index++){
            System.out.println("\ncustomer " + index);

            System.out.println("\nkindly enter account number: ");
            String accountNumber = input.next();

            System.out.println("\nkindly enter your balance: ");
            int balanceAtTheStartingOfTheMonth = input.nextInt();

            System.out.println("\ntotal of all items charged: ");
            int totalOfItems =input.nextInt();

            System.out.println("Kindly enter sum of credit: ");
            int totalOfCredit = input.nextInt();

            System.out.println("\nenter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = balanceAtTheStartingOfTheMonth + totalOfItems - totalOfCredit;

            System.out.print("\nyou have to balance: "+  newBalance);

            if (newBalance > creditLimit) {
                System.out.print("\n"+accountNumber +"credit limit exceeded");
            } else {
                System.out.print("\n"+accountNumber + "credit approved ");
            }
        }

    }
}
