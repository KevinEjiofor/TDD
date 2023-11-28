package morningExercise;

public class SubArray {
    public int[] findIndicesForLargestSum(int[] array) {
        int[] indices = new int[2];
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            int currentSum = array[i] + array[i + 1];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                indices[0] = i;
                indices[1] = i + 1;
            }

        }

        return indices;
    }

    public int[] findElementsForLargestSum(int[] array) {
        int[] elements = new int[2];
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length-1; i++) {
            int currentSum = array[i] + array[i+1];

            if (currentSum > maxSum) {
                maxSum = currentSum;

                elements[0] = array[i];
                elements[1] = array[i+1];

            }
        }
        return elements;

    }


    public boolean findPattern(String word) {
        int len = word.length();
        boolean isPatternFound = false;

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String pattern = word.substring(0, i);
                isPatternFound = true;
            
                for (int j = i; j < len; j += i) {
                    String substring = word.substring(j, j + i);
                    if (!substring.equals(pattern)) {
                        isPatternFound = false;
                    }
                }

            }
        }

        return isPatternFound;
    }


}


