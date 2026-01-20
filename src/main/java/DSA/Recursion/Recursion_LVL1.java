package DSA.Recursion;

public class Recursion_LVL1 {

    static void nToOne(int n) {

        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        nToOne(n-1);    // eg :- f(5)->f(4)->f(3)->f(2)->f(1)->f(0)
        // In this it is printing "n" when stack is being Filled
    }

    static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n-1);
        System.out.print(n+" ");
        // f(5)->f(4)->f(3)->f(2)->f(1)->f(0) (How Stack Is Filling)
        // return f(0)->f(1)->f(2)->f(3)->f(4)->f(5)    (How Stack is Being Empty)
        // In this it is printing "n" when stack is being empty
    }

    static void bothFxn(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        bothFxn(n-1);
        System.out.print(n+" ");

    }


    public static void main(String[] args) {
        bothFxn(10);
    }
}
