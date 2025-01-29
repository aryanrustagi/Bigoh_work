package backtrack;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, new boolean[nums.length], new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void generatePermutations(int[] nums, boolean[] used, List<Integer> current,
            List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(nums[i]);
                generatePermutations(nums, used, current, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}