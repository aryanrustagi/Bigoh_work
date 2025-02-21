package pepcoding;
import java.util.*;

public class StringSubset {
    public static void generateSubsets(String st, int index, String current, List<String> result) {
        if (index == st.length()) {
            result.add(current);
            return;
        }
        generateSubsets(st, index + 1, current + st.charAt(index), result);
        generateSubsets(st, index + 1, current, result);
    }

    public static void main(String[] args) {
        String st = "ABC";
        List<String> result = new ArrayList<>();
        generateSubsets(st, 0, "", result);
        System.out.println(result);
    }
}