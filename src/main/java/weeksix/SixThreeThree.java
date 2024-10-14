package weeksix;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class SixThreeThree {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userItem;

        StringWriter itemCharStream = new StringWriter();
        PrintWriter itemsOSS = new PrintWriter(itemCharStream);

        System.out.println("Enter items (type Exit to quit):");
        userItem = scnr.next();

        while (!userItem.equals("Exit")) {

            /* Your solution goes here  */
            itemsOSS.print(userItem + " ");

            userItem = scnr.next();
        }

        userItem = itemCharStream.toString();
        System.out.println(userItem);
    }
}
