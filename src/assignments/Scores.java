package assignments;
import java.util.Scanner;

public class Scores {
    public static  void main (String [] args){
        Scanner input = new Scanner(System.in);

        int total = 0;

        int studentCounter = 0;

        while ( studentCounter < 20 ) {
            System.out.println("Enter student scores: ");
            int scores = input.nextInt();
            total = total + scores ;
            studentCounter = studentCounter + 1;

        }

        int average = total/studentCounter;
        System.out.println("**************************************************************************************\n" +
                "\t\t\t Aso Rock Secondary School, Abuja Nigeria\n" +
                "**************************************************************************************\n" +
                "Class: SSS 3\n" );


        System.out.printf("Number of Student in class: %d%n", studentCounter );

        System.out.printf("Total score: %d%n", total);
        System.out.printf("Average Score: %d%n ", average);

    }
}
