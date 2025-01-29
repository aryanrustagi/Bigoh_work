package backTracking;

public class SumCount {
    public static int backtrack(int[] arr, int k, int i, int sum) {
        // Base case:
        if (i == arr.length) {
            // Check if the current sum equals k
            return sum == k ? 1 : 0;
        }

        // Include the current element in the sum
        int include = backtrack(arr, k, i + 1, sum + arr[i]);

        // Exclude the current element from the sum
        int exclude = backtrack(arr, k, i + 1, sum);

        // Return the total count of subsets
        return include + exclude;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 4, 9, 8, 3, 7 };
        int k = 11;

        int count = backtrack(arr, k, 0, 0);

        System.out.println("Number of subsets with sum " + k + " is equals to " + count);
    }
}