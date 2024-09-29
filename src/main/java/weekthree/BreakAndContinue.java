package weekthree;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        int result;
        int n;

        result = 0;

        for (n = 0; n < 6; ++n) {
            result = n + 4;

            if ((result % 2) != 0) {
                System.out.print("_");
                continue;
            }

            System.out.print(result);
        }

        System.out.println();

        Scanner scnr = new Scanner(System.in);
        result = 0;
        int stop;
        int a;
        int b;

        stop = scnr.nextInt();

        for (a = 1; a < 3; ++a) {
            System.out.print(a + ": ");

            for (b = 0; b < 4; ++b) {
                result += a;

                if (result > stop) {
                    System.out.print("_ ");
                    continue;
                }

                System.out.print(result + ",");
            }

            System.out.println();
        }
    }
}

