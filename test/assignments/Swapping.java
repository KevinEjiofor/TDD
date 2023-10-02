package assignments;




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


}
