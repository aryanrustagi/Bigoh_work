public class pattern3 {
    public static void main(String[] args) {
        int N = 5;
        int x = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        } 
    }
}