package weekfour;

import java.util.Scanner;

public class FourTwoSeven {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        int [] runTimes = new int[NUM_ELEMENTS];
        int i;

        for (i = 0; i < runTimes.length; ++i) {
            runTimes[i] = scnr.nextInt();
        }

        /* Your solution goes here  */
        System.out.println(runTimes[0]);
        System.out.println(runTimes[1]);
        System.out.println(runTimes[2]);
    }
}
