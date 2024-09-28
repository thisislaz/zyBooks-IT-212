package weekthree;

import java.util.Scanner;

public class NumberDifference {
    public static void main(String[] args) {
        int totalDifference;
        int numDifference;

        Scanner scnr = new Scanner(System.in);
        numDifference = scnr.nextInt();

        if(numDifference == -16) {
            totalDifference =  -25;
        } else {
            totalDifference =  numDifference;
        }

        System.out.println(totalDifference);
    }
}
