package String_easy;
import java.util.*;;

public class PaindromePartitioning {
    public static boolean isPalindrome(String st, int start, int end) {
        while (start < end) {
            if (st.charAt(start) != st.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void partition(String st, int start, List<String> current, List<List<String>> result) {
        if (start == st.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < st.length(); i++) {
            if (isPalindrome(st, start, i)) {
                current.add(st.substring(start, i + 1));
                partition(st, i + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String st = "aabaa";
        List<List<String>> result = new ArrayList<>();
        partition(st, 0, new ArrayList<>(), result);
        System.out.println(result);
    }
}
