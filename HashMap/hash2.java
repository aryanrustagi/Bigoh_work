package HashMap;

import java.util.*;

public class hash2 {
    public static int FirstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            if (hm.containsKey(num) == true) {
                int temp = hm.get(num);
                hm.put(num, temp + 1);
            } else {
                hm.put(num, 1);
            }
        }
        for (int num : arr) {
            if (hm.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(FirstNonRepeating(arr));
        scn.close();
    }
}