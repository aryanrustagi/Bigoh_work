package backtrack;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 3;
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums, 0, target, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void findSubsets(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index >= nums.length) return;

        // Include current number
        current.add(nums[index]);
        findSubsets(nums, index + 1, target - nums[index], current, result);

        // Exclude current number
        current.remove(current.size() - 1);
        findSubsets(nums, index + 1, target, current, result);
    }
}
