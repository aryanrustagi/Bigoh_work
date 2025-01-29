package String_easy;

public class SubstringsBacktracking {
    public static void generateSubstrings(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Exclude the current character
        generateSubstrings(str, current, index + 1);

        // Include the current character
        generateSubstrings(str, current + str.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String input = "abc";
        generateSubstrings(input, "", 0);
    }
}