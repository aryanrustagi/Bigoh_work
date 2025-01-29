package String_tooeasy;

public class StringRecursion {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println(reverseString(input));
    }
}