package hackerRank.string;

import java.util.Scanner;

//public class LexicographicalOrder {
//    We define the following terms:
//
//    Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
//    For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
//
//    A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
//    Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
//
//            Input Format
//
//    The first line contains a string denoting .
//    The second line contains an integer denoting .Constraints
//
//    consists of English alphabetic letters only (i.e., [a-zA-Z]).
//    Output Format
//
//    Return the respective lexicographically smallest and largest substrings as a single newline-separated string.



public class LexicographicalOrder {
    public static String getSmallestAndLargest(String s, int k) {
        // Scanner input = new Scanner(System.in);
        // s = input.next();
        // k = input.nextInt();

        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = largest = s.substring(0, k);


        for (int i = 1; i < s.length() - k + 1; i++) {
            String substr = s.substring(i, i + k);
            if (smallest.compareTo(substr) > 0)
                smallest = substr;
            if (largest.compareTo(substr) < 0)
                largest = substr;


        }

        return smallest + "\n" + largest;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
