import java.util.Scanner;
public class Financial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        int  subtotal = input.nextInt();

        System.out.print("Enter gratuityRate: ");
        int gratuityRate= input.nextInt();

        double rate = (double) gratuityRate/100;
        double gratuity = (double) rate * subtotal;
        double total = (double) gratuity + subtotal;

                System.out.printf("Gravity =  %.1f%n",gratuity);
        System.out.printf("Total = $  %.1f%n", total);




    }


}
