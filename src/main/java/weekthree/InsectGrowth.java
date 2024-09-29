package weekthree;

import java.util.Scanner;

public class InsectGrowth {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numInsects;

//        numInsects = scnr.nextInt();
//
//        while (numInsects > 0) {
//            if (numInsects >= 200) {
//                break;
//            }
//            System.out.print(numInsects + " ");
//            numInsects*= 2;
//        }
//        System.out.println();
        int row;
        int col;

        for(row = 2; row <= 3; row = row + 1) {
            for(col = 0; col <= 1; col = col + 1) {
                System.out.print("" + row + col + " ");
            }
        }

        char letter1;
        char letter2;

        letter1 = 'y';
        while (letter1 <= 'z') {
            letter2 = 'a';
            while (letter2 <= 'c') {
                System.out.print("" + letter1
                        + letter2 + " ");
                ++letter2;
            }
            ++letter1;
        }
    }
}
