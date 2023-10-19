package hackerRank.string;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
//        A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward
//        Given a string ,print Yes if it is a palindrome, print No otherwise.
//
//        Constraints
//
//        will consist at most lower case english letters.
        Scanner sc =new Scanner(System.in);
        String A=sc.next();
        StringBuilder newWord = new StringBuilder();

        for (int index = A.length() - 1; index >= 0; index --){
            char word = A.charAt(index);
            newWord.append(word);
        }
        if (A.equalsIgnoreCase(newWord.toString())){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");

        }
        sc.close();
    }
}
