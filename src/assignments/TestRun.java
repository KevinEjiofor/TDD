package assignments;

public class TestRun {


    public void sortingElement(int... check) {


        for (int index = 0; index < check.length - 1; index += 2) {
            int hold = check[index];
            check[index] = check[index + 1];
            check[index + 1] = hold;

        }
    }

    public void swapOddElement(int... check) {

        for (int index = 0; index < check.length - 1; index += 2) {
            if (check[index] % 2 != 0 && check[index + 1] % 2 != 0) {


                int hold = check[index];
                check[index] = check[index + 1];
                check[index + 1] = hold;
            }
        }
    }

    public int[] reverseOfElement(int[] check) {
        int length = check.length;
        int[] newCheck = new int[check.length];

        for (int counter = 0; counter < check.length; counter++) {
            newCheck[counter] = check[length - counter - 1];

        }
        return newCheck;

    }

    public int [] removeOddNumberMinusTwoFromTheOddValue(int[] number) {

        int counter = 0;

        for (int num : number) {
            if (num % 2 != 0) {

                counter++;
            }
        }

        int [] oddNumber = new int[counter];

        int i = 0;
        for (int num : number) {
            if (num % 2 != 0) {
                oddNumber[i++] = num - 2;

            }
        }
        return oddNumber;
    }



}










