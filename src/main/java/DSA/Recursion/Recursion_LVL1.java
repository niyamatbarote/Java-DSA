package DSA.Recursion;



public class Recursion_LVL1 {

    static void revNum(int n) {

        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        revNum(n-1);
    }

    static void oneToN(int n) {
        int i = 1;
        if (i == n) {
            return;
        }
        System.out.print(n+" ");
        oneToN(n+1);
    }


    public static void main(String[] args) {
        revNum(10);
    }
}
