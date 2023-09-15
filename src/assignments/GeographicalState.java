package assignments;



import java.util.Scanner;
import static assignments.Geographical.*;
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
                Geographical isPolitical = geopolitical(word);
                if (isPolitical == NORTH_CENTRAL)
                     System.out.println("NORTH CENTRAL");
               else if (isPolitical ==  NORTH_EAST) {
                    System.out.println(" NORTH EAST");
                }
               else if (isPolitical ==  NORTH_WEST) {
                    System.out.println("NORTH WEST");
                }
               else if (isPolitical ==   SOUTH_WEST) {
                    System.out.println(" SOUTH WEST");
                }
               else if (isPolitical ==   SOUTH_EAST) {
                    System.out.println(" SOUTH EAST");
                }
               else if (isPolitical ==   SOUTH_SOUTH) {
                    System.out.println("SOUTH SOUTH");
                }
               else {
                    System.out.println("Not a state");
                    entry();
                }


            }

        }


}
