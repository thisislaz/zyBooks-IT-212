package weektwo;

import java.util.Scanner;

public class LabProgram {
    public static void drivingCost(double milesPerGallon, double dollarsPerGallon) {
        double tenMiles = drivingCost(milesPerGallon, dollarsPerGallon, 10);
        double fiftyMiles = drivingCost(milesPerGallon, dollarsPerGallon, 50);
        double fourHundredMiles = drivingCost(milesPerGallon, dollarsPerGallon, 400);
        System.out.printf("%.2f %.2f %.2f", tenMiles, fiftyMiles, fourHundredMiles);
    }

    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        return (milesDriven / milesPerGallon) * dollarsPerGallon ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double milesPerGallon = scanner.nextDouble();
        double dollarsPerGallon = scanner.nextDouble();

        drivingCost(milesPerGallon, dollarsPerGallon);
        double milesDriven = scanner.nextDouble();

        System.out.println(drivingCost(milesPerGallon, dollarsPerGallon, milesDriven));
    }
}
