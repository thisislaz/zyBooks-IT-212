package weeksix;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class SixThreeTwo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Scanner inSS = null;
        String userInput;
        String userMonth;
        int userDate;
        int userYear;

        userInput = scnr.nextLine();
        inSS = new Scanner(userInput);

//        /* Your solution goes here  */
//        StringWriter strWriter = new StringWriter();
//        PrintWriter printWriter = new PrintWriter(strWriter);

        userMonth = inSS.next();
        userDate = inSS.nextInt();
        userYear = inSS.nextInt();

        System.out.println("Month: " + userMonth);
        System.out.println("Date: " + userDate);
        System.out.println("Year: " + userYear);
    }
}
