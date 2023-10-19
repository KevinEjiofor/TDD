package morningExercise;
import java.util.Arrays;

public class Anagram {


    public boolean checkAnagram(String word1, String word2) {
       boolean isAnagram ;

       char [] word = word1.toCharArray();
       char[] secondWord = word2.toCharArray();



       Arrays.sort(word);
       Arrays.sort(secondWord);


       word1 = new String(word);
       word2 = new String(secondWord);

       isAnagram = word1.equalsIgnoreCase(word2);

       return isAnagram;

    }
    public  boolean checkAnagramWithSort(String word1, String word2){
       boolean isAnagram = true;
       int countLetters = 0;
       int countWords = 0;

       if (word1.length() != word2.length()){
          isAnagram = false;

       }


       for(int i = 0; i < word1.length(); i++){
          for (int j = 0; j < word2.length(); j++){
             if (word1.charAt(i) == word1.charAt(j)){
                countLetters++;
             }
          }
          for (int j = 0; j < word2.length(); j++){
             if (word1.charAt(i) == word2.charAt(j)){
                countWords++;
             }
          }
          if (countWords != countLetters){
             isAnagram = false;
          }
          countLetters =0;
          countWords = 0;

       }

       return isAnagram;


    }
}

