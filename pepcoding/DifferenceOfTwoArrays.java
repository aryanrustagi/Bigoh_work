package pepcoding;

import java.util.Arrays;

public class DifferenceOfTwoArrays {
    public static int[] differenceArrays(int[] arr1, int[] arr2) {
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = val1 - val2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {5, 15, 25}; // Shorter array

        int[] difference = differenceArrays(arr1, arr2);
        System.out.println("Difference of Arrays: " + Arrays.toString(difference));
    }
}
