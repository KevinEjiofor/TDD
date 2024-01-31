package hackerRank;

public class Permutations {
    public static void main(String[] args) {
            Permutations permutationsObj = new Permutations();
            String originalString = "abc";
            String modifiedString = permutationsObj.swapCharacters(originalString);
            System.out.println("Original: " + originalString);
            System.out.println("Modified: " + modifiedString);

    }

    public String swapCharacters(String permutations) {

        if (permutations == null || permutations.length() < 2) {
            return permutations;
        }


        StringBuilder channel = new StringBuilder(permutations);

        char temp = channel.charAt(0);
        channel.setCharAt(0, channel.charAt(1));
        channel.setCharAt(1, temp);

        return channel.toString();
    }







}
