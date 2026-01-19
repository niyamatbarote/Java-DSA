package DSA.Math;

public class LCM {

    static int gcd(int a , int b) {

        if (a==0) {
            return b;
        }
        return gcd( b%a , a);
    }

    // Solved By self:--
    static int lcm(int a , int b) {
        int lcm = b;
        while ( true ) {
            if ( (lcm%a)==0 && (lcm%b)==0) {
                return lcm;
            }
            lcm++;
        }
    }

    // ******* Formual : LCM(a , b) = (a*b) / gcd(a , b)
    static int myLCM(int a , int b) {
        if (a==b) {
            return b;
        }
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {

        System.out.println(lcm(3,7));
        System.out.println(myLCM(3,7));

    }
}
