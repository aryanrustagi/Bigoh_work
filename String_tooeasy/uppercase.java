package String_tooeasy;

public class uppercase {
    public static String toUpperCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - 'a' + 'A');
        }
        return ch + toUpperCase(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(toUpperCase(str));
    }
}