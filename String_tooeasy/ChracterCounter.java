package String_tooeasy;

public class ChracterCounter {
    public static int countOccurrences(String str, char ch) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == ch) ? 1 : 0;
        return count + countOccurrences(str.substring(1), ch);
    }

    public static void main(String[] args) {
        String input = "banana";
        char ch = 'a';
        System.out.println(countOccurrences(input, ch));
    }
}