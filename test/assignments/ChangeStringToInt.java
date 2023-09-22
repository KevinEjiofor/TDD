package assignments;

public class ChangeStringToInt {

    public int convertToInt(String word) {
        String words = word.replaceAll("[\\D]","");

    return Integer.parseInt(words);
    }



public int findSecondLargest(int number) {
    String numberStr = Integer.toString(number);
    int largest = -1;
    int secondLargest = 0;

    for (int index = 0; index < numberStr.length(); index++) {
        char digitChar = numberStr.charAt(index);
        int digit = Character.getNumericValue(digitChar);

        if (digit > largest) {
            secondLargest = largest;
            largest = digit;
        } else if (digit > secondLargest && digit != largest) {
            secondLargest = digit;
        }
    }

    return secondLargest;
}

}



