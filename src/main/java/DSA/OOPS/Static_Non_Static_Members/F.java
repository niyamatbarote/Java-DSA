package DSA.OOPS.Static_Non_Static_Members;

public class F {

    static int c = 18;
    static {
        System.out.println("SIB of F");
    }

    public static void main(String[] args) {
        System.out.println("main() Method Started ");
        System.out.println(c);
        System.out.println(E.x);
        System.out.println(E.y);
        System.out.println("main () Method Ended");
    }
}
