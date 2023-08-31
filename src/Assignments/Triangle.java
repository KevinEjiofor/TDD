package Assignments;

public class Triangle {

    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            for (int counter2 = 1; counter2 <= counter; counter2++) {
                System.out.print("#");
            }
            for(int counter3 = 1; counter3 <= 11 - counter ; counter3++){
                System.out.print(" ");
            }
            for(int counter4 = 1; counter4 <= 11 - counter; counter4++){
                System.out.print("#");
            }
            for(int counter5 = 1;counter5 <= counter  ; counter5++ ){
                System.out.print(" ");
            }
            for(int counter6 = 1; counter6 <= counter ; counter6++){
                System.out.print(" ");
            }
            for(int counter7 = 1; counter7 <= 11 - counter; counter7++){
                System.out.print("#");
         }
            for(int counter8 = 1; counter8 <= 11 - counter; counter8++){
                System.out.print(" ");
            }
            for (int counter9 = 1; counter9 <= counter; counter9++){
                System.out.print("#");
            }
            System.out.println();
        }
        }
    }










