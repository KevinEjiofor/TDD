package morningExercise;

public class CheckForHAsh {

    public boolean checkForHash(String a, String b) {
        boolean result ;

        a = removeStringBeforeCharacter(a).replaceAll(" ","");

        b = removeStringBeforeCharacter(b).replaceAll(" ", "");

        result = a.equals(b);
        return result;


    }

    public String removeStringBeforeCharacter(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '#') {
                newWord = word.replace(word.charAt(i),' ').replace(word.charAt(i -1), ' ');
            }
        }
        return newWord;

    }




}
