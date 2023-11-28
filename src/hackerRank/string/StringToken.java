package hackerRank.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringToken {
//
//    Given a string,s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//    We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens,
//    followed by each token on a new line.
//
//    Note: You may find the String.split method helpful in completing this challenge.

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            System.out.println(0);
        } else {
            String input = sc.nextLine();

            String[] a = input.trim().split("[ !,?._'@]+");
            ArrayList<String> listOfStrings = new ArrayList<String>(Arrays.asList(a));
            System.out.println(listOfStrings.size());

            for (String str : listOfStrings) {
                System.out.println(str);
            }
        }

    }
}
