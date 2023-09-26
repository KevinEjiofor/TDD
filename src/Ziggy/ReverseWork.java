package Ziggy;

import java.util.ArrayList;

public class ReverseWork {


    public ArrayList<Integer> reverse(int [] elements1, int [] elements2) {
        ArrayList<Integer> linkedList = new ArrayList<>();

        for (int i = elements1.length-1; i >= 0; i--) {
            linkedList.add(elements1[i]);

        }
        for (int i = elements2.length-1; i >= 0; i--){
            linkedList.add(elements2[i]);

        }


        return linkedList;
    }
}
