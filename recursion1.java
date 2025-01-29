public class recursion1 {
    public static void rec1(int n) {
        if (1 > n) {
            return;
        }
        System.out.println(n);
        rec1(n - 1);
    }

    public static void main(String[] args) {
        rec1(10);
    }
}