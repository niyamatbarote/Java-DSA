package DSA.Math;

public class HCF_GCD {

    // Euclidean's Formula:-
    static int gcd(int a , int b ) {

        //Base Case:
        if (a==0) {
            return b;
        }

        return gcd(b%a, a);
    }

    public static void main(String[] args) {
        System.out.println(gcd(18,2348));

    }
}
