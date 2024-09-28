package weekthree;

import java.util.Scanner;

public class CheckingPasscodes {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean hasDigit;
        String passCode;

        hasDigit = false;
        passCode = scnr.next();

        /* Your solution goes here  */
        char passCodeZero = passCode.charAt(0);
        char passCodeOne = passCode.charAt(1);
        char passCodeTwo = passCode.charAt(2);

        if ( Character.isDigit(passCodeZero) || Character.isDigit(passCodeOne) || Character.isDigit(passCodeTwo) ) {
            hasDigit = true;
        }
        if (hasDigit) {
            System.out.println("Has a digit.");
        }
        else {
            System.out.println("Has no digit.");
        }
    }
}
