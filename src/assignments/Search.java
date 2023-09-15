package assignments;
import java.util.Scanner;

public class Search {

    public  static boolean lookFor(int Search, int [] numbers){


        for (int counter = 0; counter < numbers.length ; counter++){
            if (numbers[counter] == Search) {
                return true;


            }

        }
        return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        int counter;
        for (counter = 0; counter < size; counter++) {
            System.out.print("Enter element: ");
            int check = input.nextInt();
            numbers[counter] = check;
        }

        System.out.print("Enter element to search for: ");
        int search = input.nextInt();

        boolean result = lookFor(search,numbers);
        System.out.println("Search result: "+result);
    }

}
