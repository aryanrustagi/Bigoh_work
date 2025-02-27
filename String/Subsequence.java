package String;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    static List<String> al = new ArrayList<>();

    private static void findsubsequences(String s, String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        findsubsequences(s.substring(1), ans);
        findsubsequences(s.substring(1), ans + s.charAt(0));
    }

    public static void main(String[] args) {
        String s = "abcd";
        findsubsequences(s, "");
        System.out.println(al);
    }
}