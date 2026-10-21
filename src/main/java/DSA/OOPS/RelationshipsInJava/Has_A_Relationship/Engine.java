package DSA.OOPS.RelationshipsInJava.Has_A_Relationship;

public class Engine {

    private int cc;

    // Getters
    public int getCC() {
        return cc;
    }

    Engine(int cc) {
        this.cc = cc;
        System.out.println("Engine Object Loaded");
    }
}
