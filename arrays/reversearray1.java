public class reversearray1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        reverse(arr, 0, n-1);

        for(int i:arr)System.out.print(i+" ");
    }
    public static void reverse(int[] arr, int s, int e){
        while(s<e){
        arr[s] = arr[s]^arr[e];
        arr[e] = arr[s]^arr[e];
        arr[s] = arr[s]^arr[e];
        s++;
        e--;
        }
    }
}