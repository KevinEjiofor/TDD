package hackerRank;

import java.util.Scanner;

public class IntegerToSpring {
//    You are given an integer , you have to convert it into a string.
//    Please complete the partially completed code in the editor. If your code successfully converts into a string
//    the code will print "Good job". Otherwise it will print "Wrong answer".can range between to inclusive.
//    Sample Input 0
//            100
//    Sample Output 0
//    Good job
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);

    int n = 0;
    n = scanner.nextInt();
    String m = Integer.toString(n);


    if (n == Integer.parseInt(m)){

        System.out.print("Good job");

    }else{
        System.out.print("Wrong answer.");
    }


}



}
