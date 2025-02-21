import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k % n;
        rotateArr(arr, 0, n - 1);
        rotateArr(arr, 0, k - 1);
        rotateArr(arr, k, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(arr.length);
        scn.close();
    }

    /*
     * public static void rotateArr(int[] arr, int s, int e) {
     * int sp = s;
     * int ep = e;
     * while (sp < ep) {
     * int temp = arr[sp];
     * arr[sp] = arr[ep];
     * arr[ep] = temp;
     * sp++;
     * ep--;
     * }
     * }
     */
    public static void rotateArr(int[] arr, int s, int e) {
        for (int sp = s, ep = e; sp < ep; sp++, ep--) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
        }
    }
}