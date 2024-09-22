package weektwo;

import java.util.Scanner;

public class CalcMiles {

    public static double mphAndMinutesToMiles(double mph, double minutes) {
        double distance = mph * minutes;
        return distance / 60;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double milesPerHour;
        double minutesTraveled;

        milesPerHour = scnr.nextDouble();
        minutesTraveled = scnr.nextDouble();

        System.out.println("Miles: " + mphAndMinutesToMiles(milesPerHour, minutesTraveled));
    }
}
