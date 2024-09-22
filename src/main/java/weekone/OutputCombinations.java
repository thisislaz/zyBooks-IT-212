package weekone;

import java.util.Scanner;

public class OutputCombinations {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char a;
        char b;
        char c;

        a = scnr.next().charAt(0);
        b = scnr.next().charAt(0);
        c = scnr.next().charAt(0);

        System.out.println(a + b + c);
        System.out.println(a + c + b);
        System.out.println(b + a + c);
        System.out.println(b + c + a);
        System.out.println(c + a + b);
        System.out.println(c + a + b);
    }
}
