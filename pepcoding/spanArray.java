package pepcoding;

public class spanArray {
    public int spanarray(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        spanArray sa = new spanArray();
        System.out.println(sa.spanarray(arr));
    }
}