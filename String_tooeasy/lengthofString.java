package String_tooeasy;

public class lengthofString {
    public static int stringLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + stringLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Length of String: " + stringLength(input));
    }
}