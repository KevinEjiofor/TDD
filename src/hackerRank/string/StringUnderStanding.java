package hackerRank.string;
import java.io.*;
import java.util.*;


public class StringUnderStanding {
//    There are three lines of output:
//    For the first line, sum the lengths of and .
//    For the second line, write Yes if is lexicographically greater than otherwise print No instead.
//    For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.


        public static void main(String[] args) {
            /* En4ter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);

            String a = scanner.next();
            String b = scanner.next();
            String result;


            int sum = a.length() + b.length();

            if (a.compareTo(b) > 0) {
                result = "Yes";
            } else {
                result = "No";
            }
//        firstLetter capital with the rest of the letters
            String firstLetterA = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
            String firstLetterB = b.substring(0, 1).toUpperCase() + b.substring(1).toLowerCase();


            String lastWord = firstLetterA + " " + firstLetterB;

            System.out.print(sum+"\n"+result+"\n"+lastWord);

            scanner.close();


        }

}
