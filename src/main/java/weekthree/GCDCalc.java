package weekthree;

import java.util.Scanner;

public class GCDCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numA;
        int numB;

        System.out.print("Enter first positive integer: ");
        numA = scnr.nextInt();

        System.out.print("Enter second positive integer: ");
        numB = scnr.nextInt();

        while (numA != numB) {
            if (numB > numA) {
                numB = numB - numA;
            } else {
                numA = numA - numB;
            }
        }
        System.out.println("GCD is: " + numA);
    }
}
