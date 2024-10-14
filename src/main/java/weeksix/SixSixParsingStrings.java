package weeksix;

import java.util.Scanner;

public class SixSixParsingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        String commaError = "No comma in string";

        while (true) {
            System.out.println("Enter input string: ");
            userInput = scanner.nextLine();

            //check if user wants to quit
            if (userInput.equals("q")) {
                break;
            }

            // Check if the input contains a comma
            if (userInput.contains(",")) {
                // split the word and print the first and second words
                System.out.println("First word: " + userInput.substring(0, userInput.indexOf(",")).strip());
                System.out.println("Second word: " + userInput.substring(userInput.indexOf(",") + 1).strip());
                System.out.println();
                System.out.println();
            } else {
                System.out.println("Error: " + commaError);
            }
        }

        scanner.close();  // Close scanner after usage
    }
}
