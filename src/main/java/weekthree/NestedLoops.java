package weekthree;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numRows;
        int numColumns;
        int currentRow;
        int currentColumn;
        char currentColumnLetter;

//        numRows = scnr.nextInt();
//        numColumns = scnr.nextInt();
//
//        /* Your solution goes here  */
//        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        for(currentRow = 1; currentRow <= numRows; currentRow++) {
//            for(currentColumn = 1; currentColumn <= numColumns; currentColumn++) {
//                System.out.print(currentRow +""+ alpha.charAt(currentColumn-1) + " ");
//            }
//        }
        int mult = 0;
        int a = 4;
        int b = 5;
        int c = 20;
        int z;

        while (a < 10) {
            mult = b * a;
            if (mult > c) {
                break;
            }
            a = a + 1;
        }
        z = a;
        System.out.println(z);
    }
}
