

public class Lion extends Animal {

    // Fields
    private double maneSize;
    private int numberOfCubs;
    private double territorySize;
    private boolean alphaMale;
    private boolean sleeping;
    private boolean hunting;


    // Constructor
    public Lion(String name, int age, double weight, double height, String species, boolean isHealthy,
                double maneSize, int numberOfCubs, double territorySize) {

        super(name, age, weight, height, species, isHealthy);
        this.maneSize = maneSize;
        this.numberOfCubs = numberOfCubs;
        this.territorySize = territorySize;
        this.alphaMale = alphaMale;
        this.sleeping = sleeping;
        this.hunting = hunting;
    }

    // Methods
    public boolean isAlphaMale() {
        return this.alphaMale;
    }

    public boolean isSleeping() {
        return this.sleeping;
    }

    public boolean isHunting() {
        return this.hunting;
    }


}