package tdd;


import java.util.Scanner;
public class Palindrome {
    public static boolean palindrome(String word) {
        boolean isWord = false;
        String newList = "";
        for (int counter = 0; counter < word.length(); counter++) {
            char character = word.charAt((word.length() - 1) - counter);
            newList += character;
            if (word.equals(newList)) isWord = true;
        }
        return  isWord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter array size:  ");
//        int size = input.nextInt();

        System.out.print("Enter a word: ");
//        for (int counter = 0; counter < size; counter++) {
        String userEntry = input.next();

//            word[counter] = userEntry;
//        }
//        System.out.println(Arrays.toString(word));
        boolean result = palindrome(userEntry);
        System.out.println(result);
    }
}
