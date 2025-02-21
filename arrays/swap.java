import java.util.*;

public class swap {
    public static void swapValues(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        swapValues(a, b);

        System.out.println(a);
        System.out.println(b);
        scn.close();
    }
}
