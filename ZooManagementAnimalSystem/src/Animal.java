

public class Animal {

    // Fields
    private String name;
    private int age;
    private double weight;
    private double height;
    private String species;
    private boolean isHealthy;


    // Constructor
    public Animal(String name, int age, double weight, double height, String species, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.species = species;
        this.isHealthy = isHealthy;
    }

    public void printInfo() {
        System.out.println("{Animal name:'" + this.name + '\'' +
                "Weight:'" + this.weight + '\'' +
                "Height:'" + this.height + '\'' +
                "Species:'" + this.species + '\'' +
                "Health:'" + this.isHealthy + '\'' + "}");
    }
}