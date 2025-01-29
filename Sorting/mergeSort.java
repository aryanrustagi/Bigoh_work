package Sorting;

import java.util.Scanner;

public class mergeSort {
    public static void conquer(int[] arr, int sp, int mid, int ep) {
        int[] merged = new int[ep - sp + 1];

        int ind1 = sp;
        int ind2 = mid + 1;
        int x = 0;

        while (ind1 <= mid && ind2 <= ep) {
            if (arr[ind1] <= arr[ind2]) {
                merged[x++] = arr[ind1++];
            } else {
                merged[x++] = arr[ind2++];
            }
        }
        while (ind1 <= mid) {
            merged[x++] = arr[ind1++];
        }
        while (ind2 <= ep) {
            merged[x++] = arr[ind2++]; 
        }

        for (int i = 0, j = sp; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int sp, int ep) {
        if (sp >= ep) {
            return;
        }
        int mid = sp + (ep / 2 - sp / 2);
        divide(arr, sp, mid);
        divide(arr, mid + 1, ep);
        conquer(arr, sp, mid, ep);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        scn.close();
    }
}
