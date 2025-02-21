package pepcoding;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();


        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        for (int num : arr) {
            if (countMap.get(num) == 1) return num;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};
        System.out.println(firstNonRepeating(arr)); // Output: 1
    }
}
