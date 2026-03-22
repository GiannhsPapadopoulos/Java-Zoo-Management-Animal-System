

public class Elephant extends Animal{

    // Fields
    private double trunkLength;
    private double tuskLength;
    private boolean isAplhaMale;


    // Constructor
    public Elephant(String name, int age, double weight, double height, String species, boolean isHealthy,
                    double trunkLength, double tuskLength, boolean isAlphaMale) {

        super(name, age, weight, height, species, isHealthy);
        this.trunkLength = trunkLength;
        this.tuskLength = tuskLength;
        this.isAplhaMale = isAlphaMale;
    }

}