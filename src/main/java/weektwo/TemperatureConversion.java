package weektwo;

import java.util.Scanner;

public class TemperatureConversion {
    public static double celsiusToKelvin(double valueCelsius) {
        double valueKelvin;

        valueKelvin = valueCelsius + 273.15;

        return valueKelvin;
    }

    public static double kelvinToCelsius(double valueKelvin) {
        return valueKelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double valueC;
        double valueK;

        valueC = 10.0;
        System.out.println(valueC + " C is " + celsiusToKelvin(valueC) + " K");

        valueK = scnr.nextDouble();
        System.out.println(valueK + "  is " + kelvinToCelsius(valueK) + " C");
    }
}
