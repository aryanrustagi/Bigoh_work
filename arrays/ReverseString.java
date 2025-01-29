import java.util.*;

public class ReverseString{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();

        char[] ch = st.toCharArray();

        reverse(ch);

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        scn.close();
    }

    public static void reverse(char[] ch) {
        for (int sp = 0, ep = ch.length - 1; sp < ep; sp++, ep--) {
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
        }
    }
}
