package pepcoding;

import java.util.Arrays;

public class SquareElement {
    public static int[] square(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,5,6,7};
        square(arr);
        System.out.print(Arrays.toString(arr));
    }
}
