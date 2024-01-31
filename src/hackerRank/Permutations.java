package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Permutations permutationsObj = new Permutations();
        String originalString = "cab";
        List<String> result = permutationsObj.generatePermutations(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Permutations: " + result);
    }

    public List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(new StringBuilder(input), 0, permutations);
        return permutations;
    }

    private void generatePermutationsHelper(StringBuilder input, int start, List<String> permutations) {
        if (start == input.length() - 1) {
            permutations.add(input.toString());
            return;
        }

        for (int i = start; i < input.length(); i++) {
            swap(input, start, i);
            generatePermutationsHelper(input, start + 1, permutations);
            swap(input, start, i);
        }
    }

    private void swap(StringBuilder input, int i, int j) {
        char temp = input.charAt(i);
        input.setCharAt(i, input.charAt(j));
        input.setCharAt(j, temp);
    }
}
