package pepcoding;

public class SubarraysOfArray {
    public static void printSubarrays(int[] arr) {
        int n = arr.length;

        // Generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print subarray from index start to end
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + (i < end ? ", " : ""));
                }
                System.out.println("]");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Subarrays of the given array:");
        printSubarrays(arr);
    }
}
