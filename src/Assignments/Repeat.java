package Assignments;

public class Repeat {
    public static void main(String[] args) {
        int total = 1;
        int sum = 0;
        for (int counter = 4; counter <=10; counter +=4 ){
            for(int counter2 = 1; counter2 <= 5; counter2++ ){
                total *= counter ;
                System.out.println(counter);
            }
        }
    }

}