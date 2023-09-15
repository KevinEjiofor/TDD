package assignments;
import java.util.Scanner;

public class Average {
    public static void main (String [] arg) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int studentCounter = 0;
        while (true) {
            System.out.println("Enter Student score: ");
            int score = input.nextInt();

            if (score == -25){

                break;}
            if (score <= 0);
            total = total + score;

            studentCounter = studentCounter + 1;
        }
        int average = total / studentCounter;

        System.out.println("**************************************************************************************\n" +
                "\t\t\t Aso Rock Secondary School, Abuja Nigeria\n" +
                "**************************************************************************************\n" +
                "Class: SSS 3\n");

        System.out.printf("Number of student: %d%n", studentCounter);
        System.out.printf("Total score: %d%n", total);
        System.out.printf("Average Score: %d%n ", average);



    }


        }
