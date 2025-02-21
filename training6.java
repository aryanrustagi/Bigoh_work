import java.util.Scanner;

public class training6 {
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        int[] temp = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[size++] = arr[i];
            }
        }

        int[] result = new int[size];
        System.arraycopy(temp, 0, result, 0, size);

        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] uniqueValues = removeDuplicates(arr);

        System.out.print("Unique values: ");
        for (int value : uniqueValues) {
            System.out.print(value + " ");
        }
        scn.close();
    }
}
