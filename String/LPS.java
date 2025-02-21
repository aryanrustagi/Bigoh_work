package String;

public class LPS {
    public static int lps(String s) {
        int n = s.length();

        if (n == 1){
            return 1;
        }
        int curr = 0;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else if (ans < curr) {
                ans = curr;
            } else {
                curr = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abaacs";
        System.out.print(lps(s));
    }
}
