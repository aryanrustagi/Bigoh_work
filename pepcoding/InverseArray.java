package pepcoding;

import java.util.Arrays;

public class InverseArray {
    public static int[] inverseArray(int[] arr) {
        int[] inverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inverse[arr[i]] = i;
        }
        return inverse;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 4, 1, 2};  // Given array
        System.out.println("Original Array: " + Arrays.toString(arr));

        int[] inverse = inverseArray(arr);
        System.out.println("Inversed Array: " + Arrays.toString(inverse));
    }
}
