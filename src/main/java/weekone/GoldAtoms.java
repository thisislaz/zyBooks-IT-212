package weekone;

import java.util.Scanner;

public class GoldAtoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avogradrosNumber = 6.022e23;
        double gramsPerMoleGold = 196.9665;
        double gramsGold;
        double atomsGold;

        System.out.print("Enter grams of gold: ");
        gramsGold = sc.nextDouble();

        atomsGold = gramsGold / gramsPerMoleGold * avogradrosNumber;

        System.out.print(gramsGold + " grams of gold contains ");
        System.out.print(atomsGold + " atoms.");

    }
}