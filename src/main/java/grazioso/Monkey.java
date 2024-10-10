package grazioso;

import java.util.ArrayList;

public class Monkey extends RescueAnimal{

    // instance variable
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // constructor
    public Monkey() {}

    public Monkey(String name, String species, String tailLength, String height,
                  String bodyLength,String gender, String age,
                  String weight, String acquisitionDate, String acquisitionCountry,
                  String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // accessor methods
    public String getSpecies() {
        return species;
    }
    public String getTailLength() { return tailLength; }
    public String getHeight() { return height; }
    public String getBodyLength() { return bodyLength; }

    // mutator methods
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setTailLength(String tailLength) { this.tailLength = tailLength; }
    public void setHeight(String height) { this.height = height; }
    public void setBodyLength(String bodyLength) { this.bodyLength = bodyLength; }

}