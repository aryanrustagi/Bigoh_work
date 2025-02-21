package pepcoding;
import java.util.*;

public class LetterCasePermutation {
    public static void generatePermutations(String st, int index, String current, List<String> result) {
        if (index == st.length()) {
            result.add(current);
            return;
        }
        char ch = st.charAt(index);
        if (Character.isLetter(ch)) {
            generatePermutations(st, index + 1, current + Character.toLowerCase(ch), result);
            generatePermutations(st, index + 1, current + Character.toUpperCase(ch), result);
        } else {
            generatePermutations(st, index + 1, current + ch, result);
        }
    }

    public static void main(String[] args) {
        String st = "Ab";
        List<String> result = new ArrayList<>();
        generatePermutations(st, 0, "", result);
        System.out.println(result);
    }
}
