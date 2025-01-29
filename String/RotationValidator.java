package String;

public class RotationValidator {
    public static boolean areRotation(String a, String b) {
        int n = a.length();

        for (int i = 0; i < n; i++) {
            if (a.equals(b)) {
                return true;
            }
            char last = a.charAt(n - 1);
            a = last + a.substring(0, n - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "AAB";
        String b = "BAA";
        System.out.println(areRotation(a, b));
    }
}
