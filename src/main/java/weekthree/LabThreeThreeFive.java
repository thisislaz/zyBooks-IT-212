package weekthree;

import java.util.Scanner;

public class LabThreeThreeFive {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;
        char arrowCharacter = '*';

        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();

        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();

        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();

        while(arrowHeadWidth <= arrowBaseWidth) {
            System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();
        }
        System.out.println("");

        for (int i = 0; i < arrowBaseHeight; i++) {
            for (int j = 0; j < arrowBaseWidth; j++) {
                System.out.print(arrowCharacter);
            }
            System.out.println();

        }

        while (arrowHeadWidth != 0) {
            for (int j = 1; j < arrowHeadWidth; j++) {
                System.out.print(arrowCharacter);
            }
            System.out.println(arrowCharacter);
            arrowHeadWidth-- ;
        }

    }

}
