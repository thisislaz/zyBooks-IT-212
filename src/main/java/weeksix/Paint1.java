package weeksix;

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        // initializing scanner
        Scanner scnr = new Scanner(System.in);

        // variables for wall attributes
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea;
        double gallonsPaintNeeded;

        // variables to indicate if height and width inputs are valid
        boolean heightIsValid = false;
        boolean widthIsValid = false;

        // constant for square feet per gallons
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        // loop to ensure a valid wall height is entered
        do {
            System.out.println("Enter wall height (feet): ");

            // check if input is a valid double
            if(scnr.hasNextDouble()) {
                // assign wall-height with the next double
                wallHeight = scnr.nextDouble();

                // check if the height is positive
                if (wallHeight <= 0) {
                    // print error message if it's not
                    System.out.println("Error: Wall height cannot be zero or negative.");
                } else {
                    // set input as valid if height is positive
                    heightIsValid = true;
                }
            } else {
                // handle invalid input, such as strings instead of numbers
                System.out.println("Error: Input must be a positive number.");

                // consume the invalid input to avoid an infinite loop
                scnr.next();
            }
            // continue asking for input until height is valid
        } while (!heightIsValid);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        // loop to ensure a valid wall height is entered
        do{
            System.out.println("Enter wall width (feet): ");

            // check if input is a valid double
            if(scnr.hasNextDouble()) {

                // assign wall-height with the next double
                wallWidth = scnr.nextDouble();

                // check if the height is positive and not zero
                if (wallWidth <= 0) {
                    // print error message if it's not
                    System.out.println("Error: Wall width cannot be zero or negative.");
                } else {
                    // set input as valid if height is positive
                    widthIsValid = true;
                }
            } else {
                // handle invalid input, such as strings instead of numbers
                System.out.println("Error: Input must be a positive number.");

                // consume the invalid input to avoid an infinite loop
                scnr.next();
            }
            // continue asking for input until height is valid
        } while(!widthIsValid);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.printf("Wall area: %.2f square feet\n", wallArea);

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
