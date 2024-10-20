package grazioso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    // List of dogs and monkeys along with a scanner for input
    private static Scanner scanner = new Scanner(System.in);  // Scanner to read user input
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static ArrayList<RescueAnimal> rescueAnimals = new ArrayList<RescueAnimal>();

    // List of valid monkey species for input validation
    private static ArrayList<String> speciesList = new ArrayList<>(Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"));

    // List of training phases
    private static ArrayList<String> trainingPhasesList = new ArrayList<>(Arrays.asList("intake","Phase I","Phase II","Phase III","Phase IV", "Phase V","in service","farm"));

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
                    System.out.println("List of trained animals that are available:");
                    printAnimals();
                    break;
                case "q":
                    // Exit the program when the user chooses to quit
                    System.out.println("Exiting program. Goodbye.");
                    return;  // Exit the loop and terminate the program
                default:
                    System.out.println();
                    System.out.println("Invalid input. Choose from (1 - 6) or 'q' to quit.");
                    break;
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
        Dog trainedAndAvailableDog = new Dog("Trained and Available Dog", "German Shepherd", "male", "1", "25.6", "05-12-2019", "US", "in service", false, "US");
        Dog farmDog = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "US", "farm", false, "US");
        Dog fullyTrainedNotAvailableDog = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "CA", "in service", true, "CA");

        dogList.add(trainedAndAvailableDog);
        dogList.add(farmDog);
        dogList.add(fullyTrainedNotAvailableDog);
    }

    // Adds default monkeys to the monkeyList for testing purposes
    public static void initializeMonkeyList() {
        Monkey testTheMonkey = new Monkey("Test Monkey", "Macaque", "12 inches", "72 inches", "89 inches", "female", "4", "25.6", "12-12-2019", "CA", "in service", true, "CA");
        Monkey trainedAndAvailableMonkey = new Monkey("Trained and Available Monkey", "Macaque", "12 inches", "72 inches", "89 inches", "female", "4", "25.6", "12-12-2019", "CA", "in service", false, "CA");
        Monkey testMonkeyTwo = new Monkey("Test Monkey Two", "Macaque", "12 inches", "72 inches", "89 inches", "female", "4", "25.6", "12-12-2019", "CA", "in service", false, "CA");

        monkeyList.add(testTheMonkey);
        monkeyList.add(trainedAndAvailableMonkey);
        monkeyList.add(testMonkeyTwo);
    }

    // Method to intake a new dog by collecting its details from the user
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // exit if dog already exists
            }
        }

        Dog newDog = new Dog();
        newDog.setName(name);

        // input validations
        // temp variable
        String tempValue;
        while (true) {
            System.out.println("What is the dog's breed?");
            tempValue = scanner.nextLine();

            // Ensure the input contains only letters and spaces
            if (tempValue.matches("[a-zA-Z ]+")) {
                newDog.setBreed(tempValue);
                break;  // Valid input, exit loop
            } else {
                System.out.println("Please enter the breed of the animal using letters only.");
            }
        }

        // Gender validation
        while (true) {
            System.out.println("What is the dog's gender? (M/F)");
            tempValue = scanner.nextLine().trim().toUpperCase();
            if (tempValue.equals("M") || tempValue.equals("F")) {
                newDog.setGender(tempValue);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'M' or 'F'.");
            }
        }

        // Age validation (numeric input and less than 35)
        while (true) {
            System.out.println("What is the dog's age?");
            tempValue = scanner.nextLine();

            if (tempValue.matches("\\d+")) {  // Ensure it's a valid integer
                int age = Integer.parseInt(tempValue);  // Convert to integer for validation

                if (age < 35) {  // Check if the age is less than 35
                    newDog.setAge(String.valueOf(age));  // Store as a string in RescueAnimal
                    break;  // Valid input, exit loop
                } else {
                    System.out.println("The age must be realistic (less than 35 human years). Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Weight validation (numeric input with decimals and less than 300)
        while (true) {
            System.out.println("What is the dog's weight? (in pounds)");
            tempValue = scanner.nextLine();

            if (tempValue.matches("\\d+(\\.\\d+)?")) {  // Ensure valid number (int or decimal)
                double weight = Double.parseDouble(tempValue);  // Convert to double for validation

                if (weight < 300) {  // Ensure weight is less than 300 pounds
                    newDog.setWeight(String.valueOf(weight));  // Store as a string in RescueAnimal
                    break;  // Exit the loop
                } else {
                    System.out.println("The weight must be less than 300 pounds. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        // Acquisition Date validation (format: MM-DD-YYYY)
        while (true) {
            System.out.println("What is the acquisition date? (MM-DD-YYYY)");
            tempValue = scanner.nextLine();
            if (tempValue.matches("\\d{2}-\\d{2}-\\d{4}")) {  // Ensure correct date format
                newDog.setAcquisitionDate(tempValue);
                break;
            } else {
                System.out.println("Invalid date format. Please enter in MM-DD-YYYY format.");
            }
        }

        // Acquisition Location validation
        while (true) {
            System.out.println("What is the acquisition location? (Country)");
            tempValue = scanner.nextLine();
            if (tempValue.matches("[a-zA-Z ]+")) {
                newDog.setAcquisitionLocation(tempValue);
                break;
            } else {
                System.out.println("Please enter a valid location using letters only.");
            }
        }

        // In Service Country validation
        while (true) {
            System.out.println("Is the dog within a service country? (Y/N)");
            tempValue = scanner.nextLine().trim().toUpperCase();
            if (tempValue.equals("Y") || tempValue.equals("N")) {
                newDog.setInServiceCountry(tempValue);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }

        //setting the training status of the dog to the default value
        while(true) {
            System.out.println("In which phase of training is the dog?");
            for (String stage : trainingPhasesList) {
                System.out.println("  " + stage);
            }

            // get user input for the phase
            String phase = scanner.nextLine().trim();

            // Check if the input matches one of the valid phases
            if (trainingPhasesList.contains(phase)) {
                // set the training status directly
                newDog.setTrainingStatus(phase);
                break;
            } else {
                System.out.println("Invalid phase. Please enter a valid phase form the list.");
            }
        }

        // setting the reserved status of the dog
        while (true) {
            System.out.println("Is the dog reserved? (Y/N)");
            tempValue = scanner.nextLine().trim().toUpperCase();
            if (tempValue.equals("Y") || tempValue.equals("N")) {
                if (tempValue.equals("Y")) {
                    newDog.setReserved(true);
                } else {
                    newDog.setReserved(false);
                }
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }
        // Add the new dog to the list
        dogList.add(newDog);


        // Verify the dog's attributes
        System.out.printf("Added Dog: %s, Reserved: %b, Training Phase: %s%n",
                newDog.getName(), newDog.getReserved(), newDog.getTrainingStatus());
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

        System.out.println("What is the acquisition location? (Ex: US or CA)");
        newMonkey.setAcquisitionLocation(scanner.nextLine());

        System.out.println("Is the monkey within a service country? (Y or N)");
        newMonkey.setInServiceCountry(scanner.nextLine().toUpperCase());

        // setting training status to default value
        while (true) {
            System.out.println("In which phase of training is the monkey?");
            for (String stage : trainingPhasesList) {
                System.out.println("  " + stage);
            }
            String phase = scanner.nextLine().trim();

            // check if the input matches a valid phase from the list
            if (trainingPhasesList.contains(phase)) {
                newMonkey.setTrainingStatus(phase);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid phase form the list.");
            }
        }

        // Set reserved status based on user input
        while (true) {
            System.out.println("Is the monkey reserved? (Y/N)");
            String reserved = scanner.nextLine().trim().toUpperCase();

            // Check if the input is 'Y' or 'N' and set the reserved status accordingly
            if (reserved.equals("Y") || reserved.equals("N")) {
                newMonkey.setReserved(reserved.equals("Y"));  // True if 'Y', false if 'N'
                break;  // Exit loop on valid input
            } else {
                System.out.println("Invalid input. Please enter 'Y' for Yes or 'N' for No.");
            }
        }

        // Add the new monkey to the monkey list
        monkeyList.add(newMonkey);
    }

    // Method to reserve an animal based on user input
    public static RescueAnimal reserveAnimal(Scanner scanner) {
        // Variable to store the type of animal (dog or monkey)
        String typeOfAnimal = "";
        // Variable to store the search criteria (name or country)
        String searchCriteria = "";

        // Loop to validate animal type input
        while (true) {
            // Prompt for animal type
            System.out.println("Would you like to search for a 'monkey' or 'dog'?");
            // Read and normalize input
            typeOfAnimal = scanner.nextLine().trim().toLowerCase();
            // Check if the input is valid (either 'dog' or 'monkey')
            if (typeOfAnimal.equals("dog") || typeOfAnimal.equals("monkey")) {
                // Exit the loop if input is valid
                break;
            } else {
                // Error message
                System.out.println("Invalid animal type. Please enter 'monkey' or 'dog'.");
            }
        }

        // Loop to validate search criteria input
        while (true) {
            // Prompt for search criteria
            System.out.println("Would you like to search via 'name' or 'country'?");
            // Read and normalize input
            searchCriteria = scanner.nextLine().trim().toLowerCase();

            // Check if the input is valid (either 'name' or 'country')
            if (searchCriteria.equals("name") || searchCriteria.equals("country")) {
                // Exit the loop if input is valid
                break;
            } else {
                // Error message
                System.out.println("Invalid search criteria. Please enter 'name' or 'country'.");
            }
        }

        // Prompt the user to enter the value to search for based on the search criteria
        System.out.printf("Enter the %s to search: ", searchCriteria);
        // Read and normalize the search value
        String searchValue = scanner.nextLine().trim();

        // If the selected animal type is 'dog', search in the dog list
        if (typeOfAnimal.equals("dog")) {
            // Iterate through the list of dogs
            for (Dog dog : dogList) {
                // Check if the dog's name or acquisition location matches the search value
                if ((searchCriteria.equals("name") && dog.getName().equalsIgnoreCase(searchValue)) ||
                        (searchCriteria.equals("country") && dog.getAcquisitionLocation().equalsIgnoreCase(searchValue))) {
                    // Confirm reservation
                    System.out.println("Dog found and reserved: " + dog.getName());
                    // Set the dog as reserved
                    dog.setReserved(true);
                    // Remove the dog from the available list
                    removeAnimalFromAvailableList(dog);
                    // Return the reserved dog
                    return dog;
                }
            }
            // If no matching dog is found, display an error message
            System.out.printf("No dog found with the %s '%s'. Please try again.%n", searchCriteria, searchValue);

            // If the selected animal type is 'monkey', search in the monkey list
        } else if (typeOfAnimal.equals("monkey")) {
            // Iterate through the list of monkeys
            for (Monkey monkey : monkeyList) {
                // Check if the monkey's name or acquisition location matches the search value
                if ((searchCriteria.equals("name") && monkey.getName().equalsIgnoreCase(searchValue)) ||
                        (searchCriteria.equals("country") && monkey.getAcquisitionLocation().equalsIgnoreCase(searchValue))) {
                    // Confirm reservation
                    System.out.println("Monkey found and reserved: " + monkey.getName());
                    // Set the monkey as reserved
                    monkey.setReserved(true);
                    // Remove the monkey from the available list
                    removeAnimalFromAvailableList(monkey);
                    // Return the reserved monkey
                    return monkey;
                }
            }
            // If no matching monkey is found, display an error message
            System.out.printf("No monkey found with the %s '%s'. Please try again.%n", searchCriteria, searchValue);
        }
        // If no match is found, return null
        return null;
    }

    // Method to print the list of animals that are not reserved and are in service
    public static void printAnimals() {

        // Iterate over the list of dogs
        for (Dog dog : dogList) {
            // Check if the dog is not reserved and has a 'in service' training status
            if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                // Add the dog to the rescueAnimals list if it is not already present
                if (!rescueAnimals.contains(dog)) {
                    // Add eligible dog to the rescueAnimals list
                    rescueAnimals.add(dog);
                }
            }
        }

        // Iterate over the list of monkeys
        for (Monkey monkey : monkeyList) {
            // Check if the monkey is not reserved and has a 'in service' training status
            if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                // Add the monkey to the rescueAnimals list if it is not already present
                if (!rescueAnimals.contains(monkey)) {
                    // Add eligible monkey to the rescueAnimals list
                    rescueAnimals.add(monkey);
                }
            }
        }

        // Print the header for the list of rescue animals
        System.out.println("  These are the reserved rescue animals by name, type, and date acquired: ");

        // Iterate over the rescueAnimals list and print the details of each animal
        for (RescueAnimal rescueAnimal : rescueAnimals) {
            // Print the animal's details in a formatted string
            System.out.printf(
                    "\t%s - %s - %s - %s - %s\n",  // Format string for output
                    rescueAnimal.getName(),  // Print the animal's name
                    rescueAnimal.getTrainingStatus(),  // Print the animal's training status
                    (!rescueAnimal.getReserved() ? "Available" : "Not Available"),  // Check and print availability
                    rescueAnimal.getAcquisitionDate(),  // Print the acquisition date
                    rescueAnimal.getAcquisitionLocation()  // Print the acquisition location
            );
        }
    }


    // Method to remove an animal from the available list
    public static void removeAnimalFromAvailableList(RescueAnimal animal) {
        // Remove the animal from the rescueAnimals list if it matches by name, location, and type
        rescueAnimals.removeIf(rescueAnimal ->
                // Check if the names match (case-insensitive comparison)
                rescueAnimal.getName().equalsIgnoreCase(animal.getName()) &&
                        // Check if the acquisition locations match (case-insensitive comparison)
                        rescueAnimal.getAcquisitionLocation().equalsIgnoreCase(animal.getAcquisitionLocation()) &&
                        // Check if both animals are of the same class (e.g., Dog or Monkey)
                        rescueAnimal.getClass().equals(animal.getClass())
        );
    }


}
