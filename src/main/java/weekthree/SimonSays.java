package weekthree;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String simonPattern;
        String userPattern;
        int userScore;
        int i;

        userScore = 0;

        simonPattern = scnr.next();
        userPattern  = scnr.next();

        /* Your solution goes here  */
        for (i = 0; i < simonPattern.length(); i++) {
            if( userPattern.charAt(i) == simonPattern.charAt(i) ) {
                userScore += 1;
            } else {
                break;
            }
        }

        System.out.println("userScore: " + userScore);

        return;
    }
}
