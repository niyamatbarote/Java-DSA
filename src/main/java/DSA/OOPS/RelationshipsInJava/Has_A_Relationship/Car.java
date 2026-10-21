package DSA.OOPS.RelationshipsInJava.Has_A_Relationship;

public class Car {

    String modelName;
    private Engine engine;

    //Getters
    public Engine getEngine() {
        return engine;
    }

    Car(String modelName, int cc) {
        engine = new Engine(cc);
        this.modelName = modelName;
        System.out.println("Car Object Created & Loaded");
    }
}
