package Assignments;


import java.util.Scanner;

public class Isograms {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Isograms check = new Isograms();
        check.entry();
    }
    public void entry(){
        System.out.println("Write a sentence or word  to check if it's an isograms:   ");
        String user = input.next();
        if (user.matches("^\\D+$*")) {
            System.out.println(checkEntryToBeIsograms(user));


        }else {
            entry();
        }



    }

    public boolean checkEntryToBeIsograms(String word) {

        word = word.toLowerCase();
        int length = word.length();

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }



}
