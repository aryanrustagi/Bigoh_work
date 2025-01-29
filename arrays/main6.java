import java.util.*;

public class main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {2, 3, 1, 4, -1, 7};
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        System.out.println("final answer is: " + (n - count));
        scn.close();
    }
}