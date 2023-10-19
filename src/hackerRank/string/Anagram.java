package hackerRank.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {


    static boolean isAnagram(String a, String b) {
//        Two strings, and , are called anagrams if they contain all the same characters in
//        the same frequencies. For this challenge, the test is not case-sensitive. For example,
//        the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        boolean isAnagram = false;
        char[] c = a.toCharArray();
        Arrays.sort(c);

        char[] d = b.toCharArray();
        Arrays.sort(d);

        a = new String (c);
        b = new String (d);

        if (a.equals(b)) {
            isAnagram = true;
        }
        return isAnagram;

    }




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}