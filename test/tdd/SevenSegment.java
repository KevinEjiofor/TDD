package tdd;

import java.util.Scanner;
public class SevenSegment {
     public static void segment(String Switch) {

         String[][] objects = {
                 {"#", "#", "#", "#",},
                 {"#", " ", " ", "#",},
                 {"#", "#", "#", "#",},
                 {"#", " ", " ", "#",},
                 {"#", "#", "#", "#",},};


         for (int counter = 0; counter < objects.length; counter++) {
             for (int counter2 = 0; counter2 < objects[counter].length; counter2++) {
                 if (Switch.charAt(7) == '1') {
                     if (Switch.charAt(0) == '0') {
                         objects[0][1] = " ";
                         objects[0][2] = " ";
                     }
                     if (Switch.charAt(1) == '0') {
                         objects[1][3] = " ";
                     }
                     if (Switch.charAt(2) == '0') {
                         objects[3][3] = " ";
                     }
                     if (Switch.charAt(3) == '0') {
                         objects[4][0] = " ";
                         objects[4][1] = " ";
                         objects[4][2] = " ";
                     }
                     if (Switch.charAt(4) == '0') {
                         objects[3][0] = " ";
                     }
                     if (Switch.charAt(5) == '0'){
                         objects[1][0] = " ";
                     }
                     if (Switch.charAt(6)== '0'){
                         objects[2][1] = " ";
                         objects[2][2] = " ";
                     }
                     System.out.print(objects[counter][counter2] + " ");

                 }
             }
             System.out.println( );
         }

     }


     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter ");
         segment("11111101");



    }
        }




