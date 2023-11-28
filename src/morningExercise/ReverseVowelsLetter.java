package morningExercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsLetter {


    public String toReverseVowelsLetter(String letter) {
        char[] result = letter.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'o', 'u', 'i', 'A', 'E', 'O', 'U', 'I'));

        int i = 0;
        int j = letter.length() - 1;

        while (i < j) {
            char charI = result[i];
            char charJ = result[j];

            if (vowels.contains(charI) && vowels.contains(charJ)) {
                result[i] = charJ;
                result[j] = charI;
                i++;
                j--;
            } else {
                if (!vowels.contains(charI)) {
                    i++;
                }
                if (!vowels.contains(charJ)) {
                    j--;
                }
            }
        }

        return new String(result);
    }
}
