package Assignments;



import java.util.Scanner;
import static Assignments.Geographical.*;
public class GeographicalState {




    public static void main(String[] args) {
        GeographicalState entry = new GeographicalState();
        entry.entry();
    }

        public void entry(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the state: ");
            String word = input.next();
            if (word.matches("^\\D+$*")) {
                System.out.println(Geographical.geopolitical(word));
            }

        }


}
