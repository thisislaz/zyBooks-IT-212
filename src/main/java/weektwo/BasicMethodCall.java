package weektwo;

import java.util.Scanner;

public class BasicMethodCall {
    public static double getMinutesAsHours(double origMinutes) {
        return origMinutes / 60.0;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double minutes;

        minutes = scnr.nextDouble();

        // Will be run with 210.0, 3600.0, and 0.0.
        System.out.println(getMinutesAsHours(minutes));
    }
}
