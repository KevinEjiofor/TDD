package assignments;


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

        for (int index = 0; index < length - 1; index++) {
            for (int counter = index + 1; counter < length; counter++) {
                if (word.charAt(index) == word.charAt(counter)) {
                    return false;
                }
            }
        }

        return true;
    }



}
