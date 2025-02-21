<<<<<<< HEAD
=======
//
//

>>>>>>> 86aebbb3102b766dd6c628f04755c037bf3945c1
import java.util.*;

public class training2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        boolean isNegative = input.charAt(0) == '-';
        if (isNegative) {
            input = input.substring(1);
        }

        if (input.length() == 1) {
            System.out.println(isNegative ? "-" + input : input);
            scn.close();
            return;
        }

        char firstDigit = input.charAt(0);
        char lastDigit = input.charAt(input.length() - 1);
        String midPart = input.substring(1, input.length() - 1);

        String swappedNumber = lastDigit + midPart + firstDigit;

        if (isNegative) {
            swappedNumber = "-" + swappedNumber;
        }

        System.out.println(swappedNumber);
        scn.close();
    }
}
