package Ziggy;

import java.util.Arrays;

public class CharactersOfArray {
    public static void main(String[] args) {
        String [] word = new String[10];
        for (int counter = 0; counter < word.length; counter++){
           word[9] = "E";



        }

        System.out.println(Arrays.toString(word));
       for (int counter = 0; counter < word.length; counter++){
           if (counter % 2 != 0){
               word[counter] = "A";

           }
       }
        System.out.println(Arrays.toString(word));
        for (int counter = 0; counter < word.length; counter++) {
            word [2] = "f";
            if (counter % 2 == 0) {
                word[counter] = "L";

            }
        }
        System.out.println(Arrays.toString(word));
        Arrays.fill(word, "5");
        System.out.println(Arrays.toString(word));
    }
}
