//

import java.util.Scanner;

public class training4 {
    public static boolean isPrime(char digit) {
        return digit == '1' || digit == '2' || digit == '3' || digit == '5' || digit == '7';
    }

    public static boolean isOnlyPrime(String number) {
        for (char digit : number.toCharArray()) {
            if (!isPrime(digit)) {
                return false;
            }
        }
        return true;
    }

    public static String findLargestPrimenumber(String N) {
        int num = Integer.parseInt(N);

        for (int i = num - 1; i >= 2; i--) {
            String current = String.valueOf(i);
            if (isOnlyPrime(current)) {
                return current;
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String N = scn.nextLine();

        String result = findLargestPrimenumber(N);

        if (!result.equals("-1")) {
            System.out.println(result);
        }

        scn.close();
    }
}
