package weektwo;

import java.util.Scanner;

public class CalcPyramidVolumePartTwo {
    public static double calcBaseArea(double baseLength, double baseWidth) {
        return baseLength * baseWidth;
    }

    public static double calcPyramidVolume(double length, double width, double height) {
        double volume = calcBaseArea(length, width) * height * 1/3;
        return volume;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userLength;
        double userWidth;
        double userHeight;

        userLength = scnr.nextDouble();
        userWidth = scnr.nextDouble();
        userHeight = scnr.nextDouble();

        System.out.println("Volume: " + calcPyramidVolume(userLength, userWidth, userHeight));
    }
}
