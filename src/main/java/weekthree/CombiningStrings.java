package weekthree;

import java.util.Scanner;

public class CombiningStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String secretID;
        String firstName;
        String lastName;

        firstName = scnr.next();
        lastName = scnr.next();

        /* Your solution goes here  */
        secretID = firstName + " " + lastName;

        System.out.println(secretID);
    }
}
