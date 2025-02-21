package pepcoding;

public class majorityElement {
    public static int majority(int[] arr) {
        int count = 1;
        int candidate = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = arr[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 1, 2, 2 };
        majority(arr);
        System.out.print(majority(arr));
    }
}
