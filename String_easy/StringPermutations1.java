package String_easy;
import java.util.*;

public class StringPermutations1 {
    public static String swap(String st, int i, int j) {
        char[] ch = st.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }

    public static void permute(String st, int left, int right, List<String> result) {
        if (left == right) {
            result.add(st);
        } else {
            for (int i = left; i <= right; i++) {
                st = swap(st, left, i);
                permute(st, left + 1, right, result);
                st = swap(st, left, i);
            }
        }
    }

    public static void main(String[] args) {
        String st = "ABC";
        List<String> result = new ArrayList<>();
        permute(st, 0, st.length() - 1, result);
        System.out.println(result);
    }
}