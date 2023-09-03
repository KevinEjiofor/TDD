package chapter4;

import java.util.Scanner;

public class GasMileage{
    private static final Scanner input = new Scanner (System.in);
    public static  void main(String[] args) {
        double sumGallon = 0;
        int sumMiles = 0;



        while (true){

            System.out.println("\n\nEnter the gallons used(-1 to end): ");
            double gallon = input.nextDouble();
            if (gallon == -1 ){
                break;
            }

            System.out.println("\nEnter the miles driven: \n");
            int mile = input.nextInt();

            double average = mile/gallon;

             sumGallon += gallon ;
             sumMiles += mile;


            System.out.printf("The miles/gallon for this tank was: %.5f%n", average);

        }
        double sumAverage = sumMiles / sumGallon;

        System.out.printf("The overall average mile/gallon was: %.2f%n",sumAverage);



    }
}
