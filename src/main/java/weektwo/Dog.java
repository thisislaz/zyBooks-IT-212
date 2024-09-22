package weektwo;

public class Dog {

    // Private fields to store dog's space number, weight, and grooming status
    private int dogSpaceNumber;
    private int dogWeight;
    private String grooming;

    // Default constructor for the Dog class
    public Dog() {
        this.dogSpaceNumber = 01;
        this.dogWeight = 15;
        this.grooming = "No";
    }

    // Getter method to retrieve the dog's space number
    public int getDogSpaceNumber() {
        return this.dogSpaceNumber;
    }

    // Setter method to assign a value to the dog's space number
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    // Getter method to retrieve the dog's weight
    public int getDogWeight() {
        return this.dogWeight;
    }

    // Setter method to assign a value to the dog's weight
    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }

    // Getter method to retrieve the dog's grooming status
    public String getGrooming() {
        return this.grooming;
    }

    // Setter method to assign a value to the dog's grooming status
    public void setGrooming(String grooming) {
        this.grooming = grooming;
    }
}
