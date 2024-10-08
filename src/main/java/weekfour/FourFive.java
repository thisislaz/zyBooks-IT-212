package weekfour;

import java.util.Scanner;

public class FourFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBERS = 5;
        double peoplesWeight[];
        peoplesWeight = new double[NUMBERS];
        double totalWeight = 0;
        double averageWeight;
        double maxWeight = 0;

        for (int i = 0; i < NUMBERS; i++) {
            System.out.println("Enter weight " + (i+1) + ": ");
            peoplesWeight[i] = sc.nextDouble();
        }

        System.out.print("You entered: ");

        for (int i = 0; i < NUMBERS; i++) {
            System.out.print(peoplesWeight[i] + " ");
        }

        for (int i = 0; i < NUMBERS; i++) {
            totalWeight += peoplesWeight[i];
            if (peoplesWeight[i] > maxWeight) {
                maxWeight = peoplesWeight[i];
            }
        }

        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight: " + totalWeight/NUMBERS);
        System.out.println("Max weight: " + maxWeight);
    }
}
