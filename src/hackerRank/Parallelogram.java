package hackerRank;

import java.util.*;

public class Parallelogram {
//    Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
//    It's time to test your knowledge of Static initialization blocks. You can read about it here.
//
//    You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth
//    and height
//
//. You should read the variables from the standard input.
//
//            If
//            or
//
//, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//    Input Format
//
//    There are two lines of input. The first line contains
//: the breadth of the parallelogram. The next line contains : the height of the parallelogram


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();

            int h = scanner.nextInt();

            int area;

            if (b > 0 && h > 0){

                area = b * h;

                System.out.print(area);


            }else{
                System.out.print("java.lang.Exception: Breadth and height must be positive");

            }

            scanner.close();

        }
}


