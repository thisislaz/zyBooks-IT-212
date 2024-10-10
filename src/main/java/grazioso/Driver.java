package grazioso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    // List of dogs and monkeys along with a scanner for input
    private static Scanner scanner = new Scanner(System.in);  // Scanner to read user input
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // List of valid monkey species for input validation
    private static ArrayList<String> speciesList = new ArrayList<>(Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"));

    public static void main(String[] args) {
        // Initialize the dog and monkey lists with some default values
        initializeDogList();
        initializeMonkeyList();

        // Continuous loop to display menu and process user input until the user quits
        while (true) {
            displayMenu();
            String useInput = scanner.nextLine().toLowerCase();  // Read user input and convert to lowercase
            switch (useInput) {
                case "1":
                    intakeNewDog(scanner);  // Handle dog intake
                    break;
                case "2":
                    intakeNewMonkey(scanner);  // Handle monkey intake
                    break;
                case "3":
                    reserveAnimal(scanner);  // Reserve an animal (needs implementation)
                    break;
                case "4":
                    // Print the list of all dogs
                    System.out.println();
                    System.out.println("List of dogs:");
                    for (Dog dog : dogList) {
                        System.out.println("  "+dog.getName());
                    }
                    break;
                case "5":
                    // Print the list of all monkeys
                    System.out.println();
                    System.out.println("List of monkeys:");
                    for (Monkey monkey : monkeyList) {
                        System.out.println("  "+monkey.getName());
                    }
                    break;
                case "6":
                    // Print the list of all animals that are not reserved (needs implementation)
                    System.out.println();
                    System.out.println("List of reserved animals:");
                    printAnimals();
                    break;
                case "q":
                    // Exit the program when the user chooses to quit
                    System.out.println("Exiting program. Goodbye.");
                    return;  // Exit the loop and terminate the program
            }
        }
    }

    // This method prints the menu options for the user to select from
    public static void displayMenu() {
        System.out.println("");
        System.out.println("\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds default dogs to the dogList for testing purposes
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds default monkeys to the monkeyList for testing purposes
    public static void initializeMonkeyList() {
        Monkey bellaTheMonkey = new Monkey(
                "Bella", "Macaque", "12 inches",
                "72 inches", "89 inches", "female",
                "4", "25.6", "12-12-2019",
                "Canada", "in service",
                true, "Canada");
        monkeyList.add(bellaTheMonkey);
    }

    // Method to intake a new dog by collecting its details from the user
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
            } else if (!dog.getName().equalsIgnoreCase(name)) {
                // Collect dog details from the user and add the dog to the list
                dog.setName(name);
                System.out.println("What is the dog's breed?");
                dog.setBreed(scanner.nextLine());
                System.out.println("What is the dog's gender?");
                dog.setGender(scanner.nextLine());
                System.out.println("What is the dog's age?");
                dog.setAge(scanner.nextLine());
                System.out.println("What is the dog's weight?");
                dog.setWeight(scanner.nextLine());
                System.out.println("What is the acquisition date?");
                dog.setAcquisitionDate(scanner.nextLine());
                System.out.println("What is the acquisition location?");
                dog.setAcquisitionLocation(scanner.nextLine());
                System.out.println("Is the dog trained?");
                dog.setTrainingStatus(scanner.nextLine());
                System.out.println("Has the dog been reserved?");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    dog.setReserved(true);
                } else {
                    dog.setReserved(false);
                }
                System.out.println("Is the dog within a service country?");
                dog.setInServiceCountry(scanner.nextLine());
                dogList.add(dog);
                return;  // Exit method after adding the new dog
            }
        }
    }

    // Method to intake a new monkey by collecting its details from the user
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        boolean isSpeciesInList = true;

        // Check if the monkey already exists in the system
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return;  // Exit the method if the monkey is found
            }
        }
        // Create a new monkey with the provided name
        Monkey newMonkey = new Monkey();
        newMonkey.setName(name);

        // Collect and validate the monkey species
        System.out.println("What is the monkey's species?");
        while (isSpeciesInList) {
            String species = scanner.nextLine();
            if (speciesList.contains(species)) {
                newMonkey.setSpecies(species);
                isSpeciesInList = false;  // Exit the loop if species is valid
            } else {
                System.out.println("Invalid species.");
                System.out.println("Choose from the following list:");
                for (String specie : speciesList) {
                    System.out.println("    " + specie);
                }
            }
        }

        // Collect other details about the monkey from the user
        System.out.println("What is the monkey's tail length? (in inches)");
        newMonkey.setTailLength(scanner.nextLine());

        System.out.println("What is the height of the monkey? (in inches)");
        newMonkey.setHeight(scanner.nextLine());

        System.out.println("What is the monkey's body length? (in inches)");
        newMonkey.setBodyLength(scanner.nextLine());

        System.out.println("What is the monkey's gender? (M or F)");
        newMonkey.setGender(scanner.nextLine().toUpperCase());

        System.out.println("What is the monkey's age?");
        newMonkey.setAge(scanner.nextLine());

        System.out.println("What is the monkey's weight? (in lbs)");
        newMonkey.setWeight(scanner.nextLine());

        System.out.println("What is the acquisition date? (Ex: 10-10-2024)");
        newMonkey.setAcquisitionDate(scanner.nextLine());

        System.out.println("What is the acquisition location? (Ex: Miami, FL)");
        newMonkey.setAcquisitionLocation(scanner.nextLine());

        System.out.println("Is the monkey trained? (Y or N)");
        newMonkey.setTrainingStatus(scanner.nextLine().toUpperCase());

        System.out.println("Has the monkey been reserved? (Y or N)");
        if (scanner.nextLine().toUpperCase().equalsIgnoreCase("Y")) {
            newMonkey.setReserved(true);
        } else {
            newMonkey.setReserved(false);
        }

        System.out.println("Is the monkey within a service country? (Y or N)");
        newMonkey.setInServiceCountry(scanner.nextLine().toUpperCase());

        // Add the new monkey to the monkey list
        monkeyList.add(newMonkey);
    }

    // Method to reserve an animal (needs implementation)
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");
    }

    // Method to print the list of animals (needs implementation)
    public static void printAnimals() {
        System.out.println("The method printAnimals needs to be implemented");
    }

}
