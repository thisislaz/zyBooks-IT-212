package weekone;

import java.util.Scanner;

public class OutputTest {
    public static void main(String[] args) {
        int numItems;
        Scanner scnr = new Scanner(System.in);
        numItems = scnr.nextInt();

        System.out.println("Items: "+numItems);

        int numCondos;
        Scanner sc = new Scanner(System.in);
        numCondos = sc.nextInt();

        System.out.println("Will there be "+numCondos+" condos?");
    }
}