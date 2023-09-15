package assignments;

public class NewDouble {
    public static void  main (String [] args){

        int total = 1;
        for(int counter = 4; counter <= 10; counter += 4) {
            for (int counter2 = 1; counter2 <= 5; counter2++) {
                total *= counter;
                System.out.print(total + " ");
            }
            total = 1;
        }
    }


}
