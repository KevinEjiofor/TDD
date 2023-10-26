package morningExercise;


public class Subsequent {
    public boolean isSubsequent(String firstWord, String secondWord) {
        boolean isSubsequentResult;

        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

            int sIndex = 0;
            int tIndex = 0;

            while (sIndex < firstWord.length() && tIndex < secondWord.length()) {
                if (firstWord.charAt(sIndex) == secondWord.charAt(tIndex)) {
                    sIndex++;

                }
                tIndex++;

            }

            isSubsequentResult = sIndex == firstWord.length();

            return isSubsequentResult;
    }






}
