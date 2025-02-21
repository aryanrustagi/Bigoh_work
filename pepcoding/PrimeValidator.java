package pepcoding;

import java.util.Scanner;
public class PrimeValidator {
    public static boolean isPrime(int n){
        if(n<=1){return false;}
        if(n==2||n==3){return true;}
        if(n%2==0||n%3==0){return false;}
        for(int i=5;i*i<n;i+=6){
            if(n%i==0||n%(i+2)==0){return false;}
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i=0;i<n;i++){
            if(isPrime(arr[i])){
                System.out.println("Prime");
            }else{
                System.out.println("not Prime");
            }
        }
        scn.close();
    }
}
