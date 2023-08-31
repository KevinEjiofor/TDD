package Ziggy;

import java.sql.Array;
import java.util.Arrays;

public class FloatInArray {
    public static void main(String[] args) {
        double[] number = new double[8];
        for (int counter = 0; counter < number.length; counter++) {
            number[counter] = 7;
        }
        System.out.println(Arrays.toString(number));

        for(int counter = 0 ; counter < number.length; counter++){
            if ( counter % 2 != 0){
                number[counter] -= 1.5;

            }

        }
        System.out.println(Arrays.toString(number));

        for(int counter = 0 ; counter < number.length; counter++){
            if ( counter % 2 != 0){
                number[counter] = 7- 1.5;
                number[7] = number[counter] -4.7;

            }
            if ( counter % 2 == 0){
                number[counter] += 2.3;
                number[0] = number[counter] -4.7;


            }

        }
        System.out.println(Arrays.toString(number));

    }



    }



