package Ziggy;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
//     double  myList [] = new double[5];
//     double max = myList[0];
//     double total = 0;
//        for (int i = 1; i < myList.length; i++) {
//            myList[i] = i;
//            total += myList[i];
//          if ( myList[i] > max){
//              max = myList[i];
//          }
//        }
//        System.out.println(max);
//        System.out.println(total);
//        System.out.println(myList[1]);
//        for (int i = 1; i < myList.length; i++) {
//            System.out.print(myList[i] + " ");
//        }
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = Math.random() * 100;
//            System.out.println(myList[i]);
//        }
//        int[] sourceArray = {2, 3, 1, 5, 10};
//        int[] targetArray = new int[sourceArray.length];
//        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
////        for (int i = 0; i < sourceArray.length; i++) {
////            targetArray[i] = sourceArray[i];
//        System.out.println(Arrays.toString(targetArray));
//    }
        int[] source = {3, 4, 5};
        int [] t  = new int[source.length];

        System.arraycopy(source,0,t,0,source.length);
        System.out.println(Arrays.toString(t));
    }

}

