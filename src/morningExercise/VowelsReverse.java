package morningExercise;

import java.util.Collections;
import java.lang.StringBuffer;
import java.util.List;
import java.util.ArrayList;


public class VowelsReverse {

   public String reverseVowels(String word) {

        List <Character>vowels = new ArrayList <>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        List <Character>values = new ArrayList <>();
        List <Integer>keys = new ArrayList <>();

        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                keys.add(i);
                values.add(word.charAt(i));
            }
        }

        StringBuilder reverseVowels = new StringBuilder(word);

        Collections.reverse(values);
        int count = 0;

        for (Integer num : keys) {
            reverseVowels.replace(num, num + 1,String.valueOf(values.get(count)));
            count++;
        }


        return reverseVowels.toString();

    }


}
