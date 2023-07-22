package tdd;

public class OX {
    public static void main(String[] args) {
        String[][] objects = new String[][]{
                {"x", "o","x" },
                {"o", "o", "x"},
                {"o", "x", "x"},};
        for (int counter = 0; counter < objects.length; counter++) {
            for (int counter1 = 0; counter1 < objects[counter].length; counter1++) {

                System.out.print(objects[counter][counter1] + " ");
            }
            System.out.println();
        }

        }
    }

