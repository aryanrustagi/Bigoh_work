package backtrack;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(nums, 0, target, new ArrayList<>(), result);
        System.out.println(result);
    }

    private static void findCombinations(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index >= nums.length) return;

        // Include current number
        current.add(nums[index]);
        findCombinations(nums, index, target - nums[index], current, result);

        // Exclude current number
        current.remove(current.size() - 1);
        findCombinations(nums, index + 1, target, current, result);
    }
}
