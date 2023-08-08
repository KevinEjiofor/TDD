package Ziggy;

import java.util.Arrays;

public class PositionOfArrays {
    int check;
    public int[] set;

    public static void main(String[] args) {
        int[] check = {5, 18, 32, 3, 4,};
        int[] position = new int[check.length];

        for(int index = 0; index < check.length; index ++  )
            position[index] =check[index];

            Arrays.sort(position);

        System.out.println(Arrays.toString(position));

        int[] newPosition = new int[check.length];

        for (int index = 0; index < check.length; index++) {
            for (int index2 = 0; index2 < position.length; index2++) {
                if (check[index] > position[index2]) {


                }


            }


        }

    }


    }


