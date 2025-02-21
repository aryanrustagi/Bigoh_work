import java.util.Scanner;

public class training5 {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static long smallestMultiple(long n) {
        long result = 1;
        for (int i = 2; i < n; i++) {
            result = lcm(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();

        long smallestMultiple = smallestMultiple(n);
        System.out.println(smallestMultiple);
        scn.close();
    }
}