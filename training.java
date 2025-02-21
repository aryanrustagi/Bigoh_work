
import java.util.*;

public class training {
    public static boolean NameValidator(String name) {
        String vowels = "AEIOUaeiou";
        for (char vowel : vowels.toCharArray()) {
            int count = 0;
            for (char c : name.toCharArray()) {
                if (c == vowel) {
                    count++;
                    if (count > 1) {
                        return false;
                    }
                }
            }
        }

        int firstSindex = -1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'S') {
                if (firstSindex == -1) {
                    firstSindex = i;
                } else {
                    for (int j = firstSindex + 1; j < i; j++) {
                        if (name.charAt(j) == 'T') {
                            return false;
                        }
                    }
                    firstSindex = i;
                } 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println(NameValidator(name));
        scn.close();
    }
}