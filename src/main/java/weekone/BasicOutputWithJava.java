package weekone;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class BasicOutputWithJava {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;

        System.out.println("Enter integer: ");
        userNum = scnr.nextInt();
        System.out.println("You entered: ");
        System.out.println(userNum+" squared is "+ (Math.pow(userNum,2)));
        System.out.println("And " + userNum + " cubed is " + (Math.pow(Math.pow(userNum,2),2)) + "!!");
        System.out.print("Enter another integer: ");

        int newNum = scnr.nextInt();
        System.out.println(userNum + " + " + newNum + " is " + (userNum + newNum));
        System.out.println(userNum + " * " + newNum + " is " + (userNum * newNum));

        return;
    }
}
