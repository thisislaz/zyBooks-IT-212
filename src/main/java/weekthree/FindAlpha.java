package weekthree;

import java.util.Scanner;

public class FindAlpha {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String passCode;

        passCode = scnr.next();

        if(Character.isLetter(passCode.charAt(0)) && Character.isLetter(passCode.charAt(1))) {
            System.out.println("Alphabetic at " + passCode.indexOf(passCode.charAt(0)));
            System.out.println("Alphabetic at " + passCode.indexOf(passCode.charAt(1)));
        } else if (Character.isLetter(passCode.charAt(1))) {
            System.out.println("Alphabetic at " + passCode.indexOf(passCode.charAt(1)));
        } else if (Character.isLetter(passCode.charAt(0))) {
            System.out.println("Alphabetic at " + passCode.indexOf(passCode.charAt(0)));
        }
    }
}
