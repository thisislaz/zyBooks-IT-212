package weekthree;

import java.util.Scanner;

public class LabThreeThreeSix {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userText;
        // Add more variables as needed

        userText = scnr.nextLine();
        String stripedText = userText.replaceAll("[\\s.,!]", "");

        for (int i = 0; i < stripedText.length(); i++) {
            if (stripedText.charAt(i) == ' ') {
                stripedText = stripedText.substring(0, i-1) + stripedText.substring(i + 1) ;
            }
        }
        System.out.println(stripedText.length());
    }
}
