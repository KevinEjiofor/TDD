package Assignments;

import java.util.Objects;

public class TicTacToeGame {

    public static void main(String[] args) {
        String[][] objects = new String[][]{
                {"x", "o", "x" },
                {"o", "o", "x" },
                {"o", "x", "x" },};
        for (int counter = 0; counter < objects.length; counter++) {
            for (int counter1 = 0; counter1 < objects[counter].length; counter1++) {
                if (Objects.equals(objects[counter][counter1], "x")) {
                    System.out.print("1"+" ");

                }else {
                    System.out.print("0"+" ");
                }



            }
            System.out.println();

        }

    }
}