import java.util.Scanner;

public class training3 {
    public static boolean regex(String url) {
        String regex1 = "^(https?://)?([\\w.-]+)+(:[0-9]+)?(/.*)?$";
        return url.matches(regex1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String url = scn.nextLine();

        if (regex(url)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scn.close();
    }
}
