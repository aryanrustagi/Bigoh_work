package backTracking;

import java.util.*;

public class Subsets {
    public List<String> generateSubsets(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new StringBuilder(), result);
        return result;
    }

    private void backtrack(String s, int index, StringBuilder current, List<String> result) {
        if (index == s.length()) {
            result.add(current.toString());
            return;
        }

        backtrack(s, index + 1, current, result);

        current.append(s.charAt(index));
        backtrack(s, index + 1, current, result);
        current.deleteCharAt(current.length() - 1);
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        System.out.println(subsets.generateSubsets("abc"));
    }
}