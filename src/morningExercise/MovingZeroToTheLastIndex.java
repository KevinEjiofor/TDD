package morningExercise;

public class MovingZeroToTheLastIndex {


    public void moveNumberZeroToTheLastIndex(int... numbers) {
        int length = numbers.length;
        int nonZeroIndex = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] != 0) {
                numbers[nonZeroIndex] = numbers[i];
                nonZeroIndex++;
            }
        }

        for (int i = nonZeroIndex; i < length; i++) {
            numbers[i] = 0;
        }



    }
    public  void moveZeroIndex(int[] index) {

        for (int i = 0; i < index.length; i++){
            for (int j = i + 1; j < index.length; j++) {
                if (index[i] == 0) {
                    int hold = index[i];
                    index[i] = index[j];
                    index[j] = hold;

                }
            }
        }
    }


}
