package assignments;


import java.util.ArrayList;

public class Swapping {
    public void swapElementIndexTwoAndFour(int... element) {
//        int temp = element[2] ;
//        element[2] = element[4];
//        element[4] = temp;

        int indexTwo = element[2];
        int indexFour = element[4];

        element[2] += indexFour;
        element[4] += indexTwo;

        element[2] -= indexTwo;
        element[4] -= indexFour;





    }

    public String resetIndexOfWord(String word,int [] index ){

        char[] result = new char[word.length()];

        for (int i = 0; i < index.length; i++) {
            result[i]= word.charAt(index[i]);
        }

        return new String(result);

    }



    public int highestFrequencyNumber(int[] elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        int maxCount = 0;
        int result = elements[0];

        for (int element : elements) {
            int count = 0;
            for (int i : elements) {
                if (element == i) count++;

            }

            if (count > maxCount) {
                maxCount = count;
                result = element;
            }
        }

        return result;
    }

}
