package DSA.Recursion;

public class Recursion_Pattern_Sorting {

    static void starPattern(int r) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // starPattern Using Recursion :
    static void starPattern01(int r, int c) {
        // Base Case:
        if (r == 0) {
            return;
        }
        // Recursive Part :
        if (r>c) {
            starPattern01(r, c+1);
            System.out.print("* ");
            // It is Printing when it's coming out of the STACK

        }else {
            starPattern01(r-1,0);
            System.out.println();
            // It is Printing when it's comig out of the STACK
        }
    }

    static void starPattern1(int r) {
        for (int i = 0; i <= r; i++) {
            for (int j = r; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // starPattern1 Using Recursion
    static void starPattern12(int r, int c) {
        // Base Case:
        if (r == 0) {
            return;
        }
        // Recursive Part
        if (r>c) {
            System.out.print("* ");
            starPattern12(r,c+1);
            // It is Printing when it's Being Put in the STACK
        }else {
            System.out.println();
            starPattern12(r-1,0);
            // It is Printing when it's Being put in the STACK
        }
    }



    public static void main(String[] args) {
        starPattern01(4,0);
    }
}
