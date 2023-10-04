package assignments;

import java.util.Scanner;

public class ElementEvenPosition {
    private final static Scanner input = new Scanner(System.in) ;
    public static String Even(int... numbers){
        StringBuilder newList = new StringBuilder(" ");

        int counter = 0;
        for(; counter < numbers.length;counter++){
            if (counter % 2 == 0){
                int another = numbers[counter];

                newList.append(another).append(" ");

            }

        }
        return newList.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int [] numbers = new int [size];

        for (int counter = 0; counter < size; counter++){
            System.out.print("Enter element: ");
            int entry = input.nextInt();
            numbers[counter] = entry;


        }
        String result = Even(numbers);
        System.out.println("odd number output: "+result);


    }
}
