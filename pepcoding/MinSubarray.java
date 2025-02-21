package pepcoding;

public class MinSubarray{
    public static int minSubArrayLen(int[] nums, int target){
        int left = 0,sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum = sum + nums[right];

            // Try to shrink the window from the left while sum >= target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
        }
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLength;
        }

    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println("Minimum Subarray Length: " + minSubArrayLen(nums, target));
    }
}