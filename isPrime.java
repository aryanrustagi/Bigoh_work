public class isPrime {
    public static void main(String args[]) throws Exception {
        int n = 5;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count = count + 2;
                } else {
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}