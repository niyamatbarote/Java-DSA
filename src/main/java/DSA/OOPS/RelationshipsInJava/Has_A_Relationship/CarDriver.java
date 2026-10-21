package DSA.OOPS.RelationshipsInJava.Has_A_Relationship;

public class CarDriver {
    public static void main(String[] args) {

        Car car = new Car("Maruti Suzuki 800", 800);

        // Proof that Car has An Engine :
        System.out.println(car);
        System.out.println(car.getEngine());

        // Accessing public Properties :
        System.out.println(car.modelName);

        // Accessing Private Properties :
        System.out.println(car.getEngine().getCC());

    }
}
