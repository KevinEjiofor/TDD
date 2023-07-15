package tdd;

public class Picture {

    public static void main(String[] args) {
        int[][] pictures = {
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},};


        for (int pixel = 0; pixel < pictures.length; pixel++) {

            for (int pic = 0; pic < pictures[pixel].length; pic++){
                if(pictures[pixel][pic] == 0){
                    System.out.print(" ");
                }
                if (pictures[pixel][pic] == 1){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }



    }
}



