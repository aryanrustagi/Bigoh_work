package HashMap;

import java.util.*;

public class hash3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(countDistinct(arr));

        scn.close();
    }

    public static int countDistinct(int[] arr) {
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }

        return hs.size();
    }
}