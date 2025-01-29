package String;

public class StringPermutations {
    public static void generatePermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
            return;
        }

        for (int i = start; i <= end; i++) {
            str = swap(str, start, i);
            generatePermutations(str, start + 1, end);
            str = swap(str, start, i); // Backtrack
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "abc";
        generatePermutations(input, 0, input.length() - 1);
    }
}