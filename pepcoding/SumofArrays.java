package pepcoding;

import java.util.Arrays;

public class SumofArrays {
    public static int[] sumArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = val1 + val2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6, 7 }; // Larger array

        int[] sum = sumArrays(arr1, arr2);
        System.out.println("Sum of Arrays: " + Arrays.toString(sum));
    }
}