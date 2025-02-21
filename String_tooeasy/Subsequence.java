package String_tooeasy;

public class Subsequence {
    public static void printSubsequences(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        // Exclude the current character
        printSubsequences(str, current, index + 1);
        // Include the current character
        printSubsequences(str, current + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String input = "abc";
        printSubsequences(input, "", 0);
    }
}