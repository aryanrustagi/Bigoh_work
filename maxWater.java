public class maxWater {
    public static int maxwater(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        int i = 0, j = arr.length - 1;
        int ans = 0;
        while (i < j) {
            int width = j - i;
            int height = Math.min(arr[i], arr[j]);
            int water = width * height;
            ans = Math.max(ans, water);
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 4, 7, 3, 9, 5, 4, 1, 2};
        System.out.println(maxwater(arr));
    }
}
