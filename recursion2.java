public class recursion2 {
    public static void rec(int n) {
        if (1 < n) {
            return;
        }
        System.out.println(n);
        rec(n - 1);
    }

    public static void main(String[] args) {
        rec(10);
    }
}
