package pepcoding;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    public static List<List<Integer>> getSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n subsets

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { // Check if j-th bit is set in i
                    subset.add(arr[j]);
                }
            }
            subsets.add(subset);
        }

        return subsets;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subsets = getSubsets(arr);

        System.out.println("Subsets of the given array:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
