package weekone;

import java.util.Scanner;

public class CircumferenceToArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI_VAL = 3.14159265;

        double circleRadius;
        double circleCircumference;
        double circleArea;

        System.out.println("Enter the circumference of a circle: ");
        circleCircumference = sc.nextDouble();

        circleRadius = circleCircumference / (2 * PI_VAL);
        circleArea =  PI_VAL * circleRadius * circleRadius;

        System.out.println("The area of the circle is: " + circleArea);
    }
}