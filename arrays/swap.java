import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        scn.close();
    }
}
