package weekone;

import java.util.Scanner;

public class CubeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sideLength;
        int cubeVolume;

        System.out.print("Enter the side length: ");
        sideLength = sc.nextInt();

        cubeVolume = (int) Math.pow(sideLength,3);
        System.out.println("The cube volume is " + cubeVolume);
    }
}