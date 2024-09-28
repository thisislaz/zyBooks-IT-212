package weekthree;

import java.util.Scanner;

public class CensoredWords {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        userInput = scnr.nextLine();

        /* Your solution goes here  */
        if(userInput.indexOf("darn") != -1) {
            System.out.println("Censored");
        } else {
            System.out.println(userInput);
        }
    }
}
