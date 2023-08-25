package Assignments;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonStore {
    private  String customerName;
    private String cashierName;
    private ArrayList<String> product = new ArrayList<>();
    private  ArrayList<Integer> productNumber = new ArrayList<>();
    private  ArrayList<Double> productNumberAmount = new ArrayList<>();
    private ArrayList<Double> totalProductNumber = new ArrayList<>();

    private Integer discountInput ;

    private Double amountPaid;

    private String storeName = "SEMICOLON STORE";

    private String Branch = "MAIN BRANCH";

    private String Address = "312, HERBERT MACAULAY WAY, SABO YABA, LAGOS STATE.";

    private String number = "03293828343";

    private LocalDateTime date = LocalDate.now().atStartOfDay();



    private final Scanner input = new Scanner (System.in);

    public static void main(String[] args) throws InterruptedException{
        SemicolonStore  customerNameEntry  = new  SemicolonStore();
        customerNameEntry.CustomerNameEntry();

    }

    public void CustomerNameEntry(){
        System.out.print("What is the customer's Name: ");
        String user = input.nextLine();
        customerName  = user;
        if (user.matches("^\\D+$*")) {
            listOfItems();

        }
        else {
            System.out.println("\ninvalid entry");
            CustomerNameEntry();
        }

    }

    public void  listOfItems() {
        System.out.println("\nWhat did the user buy? ");
        String items = input.nextLine();
        product.add(items);
        if (items.matches("^\\D+$*")){
            unitOfItems();}
        else {
                System.out.println("invalid entry");
                listOfItems();}
    }

    public void unitOfItems(){
        System.out.println("\nHow many pieces?");
        String numberOfItems = input.nextLine();

        if (numberOfItems.matches("^\\d+$*")) {
            productNumber.add(Integer.valueOf(numberOfItems));
            unitPerItemsAmount();
        }
        else {
            System.out.print("Invalid entry");
            unitOfItems();}

    }

    public void unitPerItemsAmount() {
        System.out.println("\nHow much per unit?");
        String amount = input.nextLine();
        if (amount.matches("^\\d+$*")) {
            productNumberAmount.add(Double.valueOf(amount));
            conditionForItems();
        }else {
            System.out.print("Invalid entry");
            unitPerItemsAmount();

        }
    }

    public void conditionForItems(){
        System.out.println("\nAdd more items?"+
                "\nif yes enter \"Yes\"  else enter \" No\"");
        String mayBe = input.nextLine();

         boolean isYes = mayBe.equalsIgnoreCase("yes");
         boolean isNo = mayBe.equalsIgnoreCase("no");
        if (mayBe.matches("^\\D+$*")) {


            if (isYes) {
                listOfItems();
            } else if (isNo) {
                CashierNameEntry();
            }
        }

         else {
             System.out.println("\nInvalid entry");
             conditionForItems();}

    }
    public void CashierNameEntry() {
        System.out.println("\nWhat is  your Name: ");
        String user = input.nextLine();

        if (user.matches("\\D+$*")) {discount();
            cashierName = user;
        }
        else {
            System.out.println("invalid entry");
            CashierNameEntry();
        }

    }



    public void discount(){
        System.out.println("\nHow much discount will the customer get \n don't give more than 10% discount");
        String discount = input.nextLine();
        int num = Integer.parseInt(discount);
        discountInput = num;
        if (discount.matches("^\\d+$*") && num <= 10) {
            StoreInfo(); }


        else {
            System.out.println("\n Kindly reduce the discount , don't give any more than 10% ");
         discount();
        }

    }

    private String getStoreName(){return storeName;}
    private String getAddress(){return  Address;}

    private String getBranch(){return Branch;}

    private String getNumber(){return number;}
    private LocalDateTime getDate(){return date;}



    public void StoreInfo() {
        System.out.print("\n"+storeName + "\n" + Branch + "\nLocation : " + Address + "\nTel : " + number + "\nDate : " + date
                + "\nCashier : " + cashierName + "\nCustomer Name : " + customerName);
            storeReceiptBody();
    }
    public void storeReceiptBody() {
        System.out.println("\n" + "=".repeat(60) +
                "\n\t ITEM \t\t\tQTY \t  PRICE \t\tTOTAL(NGN)" + "\n" +
                "-".repeat(60));

        double subTotal = 0.0;
        int index;
        for (index = 0; index < product.size(); index++) {
            double num = productNumberAmount.get(index) * productNumber.get(index);
            totalProductNumber.add(num);

            subTotal += num;




            System.out.printf("%10s %10d %14.2f  %14.2f %n", product.get(index), productNumber.get(index),
                    productNumberAmount.get(index), totalProductNumber.get(index));
        }
        double discountT = subTotal * ((double) discountInput /100);
        double vat = subTotal * 0.175;
        double bill = subTotal + vat - discountT;

        System.out.print("\n"+"-".repeat(60));
        System.out.printf("%n\t\t\t\t Sub Total: %.2f " + "\n\n\t\t\t\t Discount: %.2f"
               + "\n\n\t\t\t\t VAT @ 17.50: %.2f",subTotal,discountT,vat);
                System.out.print("\n" + "=".repeat(60)+ "\n\t\t\t\t BIll Total: " + bill
        +"\n" + "=".repeat(60)+"\nTHIS IS NOT A RECEIPT KINDLY PAY "+ bill+"\n" + "=".repeat(60));

        amountFromCustomer();
    }

    public void amountFromCustomer(){
        System.out.println("\n\nHow much did the customer give you? ");
        String amountT = input.next();
        amountPaid = Double.valueOf(amountT);
        if (amountT.matches("^\\d*")){
            customerReceipt();

        }
        else {
            System.out.println();
            amountFromCustomer();
        }


    }
    public void customerReceipt(){
        System.out.print("\n"+storeName + "\n" + Branch + "\nLocation : " + Address + "\nTel : " + number + "\nDate : "
                + date + "\nCashier : " + cashierName + "\nCustomer Name : " + customerName);
        System.out.println("\n" + "=".repeat(60) +
                "\n\t ITEM \t\t\tQTY \t  PRICE \t\tTOTAL(NGN)" + "\n" +
                "-".repeat(60));

        double subTotal = 0.0;
        int index;
        for (index = 0; index < product.size(); index++) {
            double num = productNumberAmount.get(index) * productNumber.get(index);
            totalProductNumber.add(num);

            subTotal += num;




            System.out.printf("%10s %10d %14.2f  %14.2f %n", product.get(index), productNumber.get(index),
                    productNumberAmount.get(index), totalProductNumber.get(index));
        }
        double discountT = subTotal * ((double) discountInput /100);
        double vat = subTotal * 0.175;
        double bill = subTotal + vat - discountT;
        double amountP = amountPaid - bill;

        System.out.print("\n"+"-".repeat(60));
        System.out.printf("%n\t\t\t\t Sub Total: %.2f " + "\n\n\t\t\t\t Discount: %.2f"
                + "\n\n\t\t\t\t VAT @ 17.50: %.2f",subTotal,discountT,vat);
        System.out.print("\n"+"-".repeat(60));
        System.out.printf("%n\t\t\t\t Bill Total: %.2f " + "\n\n\t\t\t\t Amount Paid: %.2f"
                + "\n\n\t\t\t\t Balance: %.2f",bill,amountPaid,amountP);
        System.out.print("\n"+"-".repeat(60)+"\n\tTHANK YOU FOR YOUR PATRONAGE"+"\n"+"=".repeat(60));



    }

    }




