package morningExercise;

public class ReverseString {

        public String reverseWords(String input) {
            String[] words = input.split(" ");


            StringBuilder reversed = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reversedWord = new StringBuilder(word).reverse().toString();
                reversed.append(reversedWord);


                if (i < words.length - 1) {
                    reversed.append(" ");
                }
            }

            return reversed.toString();
        }


}
