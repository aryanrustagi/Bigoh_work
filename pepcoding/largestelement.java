package pepcoding;

public class largestelement {
    public int large(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        largestelement le = new largestelement();
        System.out.println(le.large(arr));
    }
}