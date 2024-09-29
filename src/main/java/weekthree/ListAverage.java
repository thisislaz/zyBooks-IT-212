package weekthree;

import java.util.Scanner;

public class ListAverage {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currValue;
        int valuesSum;
        int numValues;

        valuesSum = 0;
        numValues = 0;

        currValue = scnr.nextInt();

        while (currValue > 0) {
            valuesSum += currValue;
            numValues++;
            currValue = scnr.nextInt();
        }
        System.out.println("Average: " + (valuesSum / numValues));
    }
}
