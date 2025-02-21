public class fibbonacci {
    public static int fibb(int n) {
        if(n==0 || n==1){
            return n;
        }
        int temp = fibb(n-1) + fibb(n-2);

        return temp;
    }
    public static void main(String[] args){
        int n = 6;
        System.out.println(fibb(n));
       } 
}