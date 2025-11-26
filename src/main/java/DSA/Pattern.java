package DSA;

public class Pattern {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Here (i)
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Here (j)
            }
            System.out.println();
        }

        // for (int i = 0; i <= n; i++) {
        //     for (int j = 4; j >= (n / 2) + 1; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = n / 2; j <= i ; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
