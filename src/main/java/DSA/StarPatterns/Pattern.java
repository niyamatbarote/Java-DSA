package DSA.StarPatterns;

public class Pattern {
    public static void main(String[] args) {

        int n = 5;

        System.out.println("Lower Left Triangle Pattern :");
        // Lower Left Triangle Pattern :
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Upper Left Triangle Pattern :");
        // Upper Left Triangle Pattern :
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Triangular Numbers By Col:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Here (i)
            }
            System.out.println();
        }

        System.out.println("Triangular Numbers By Row:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Here (j)
            }
            System.out.println();
        }

        System.out.println("Principal Diagonal Pattern:");
         // Principal Diagonal Pattern:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Secondary Diagonal Pattern :");
        // Secondary Diagonal Pattern :
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j==n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("X Using *'s :");
        // Print X Using *'s
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j || i+j==n+1){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hollow Square Pattern");
        // Hollow Square Pattern:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || j==1 || i==n || j==n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Triangular Numbers By Col:");
        // Triangular Numbers By Col:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        System.out.println("E Patter :");
        // E Patter :
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || i==(n/2)+1 || i==n || j==1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("  ");
        }

        System.out.println("Hollow Upper Left Triangle :");
        // Hollow Upper Left Triangle :
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j==n+1 || i==1 || j==1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hollow Lower Left Triangle :");
        // Hollow Lower Left Triangle :
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==1 || i==j || i==n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hollow Upper Right Triangle :");
        // Hollow Upper Right Triangle :
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j || i==1 || j==n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hollow Lower Right Triangle :");
        // Hollow Lower Right Triangle :
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i+j==n+1 || i==n || j==n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

//        System.out.println("Solid Upper Right Triangle :");
//        // Solid Upper Right Triangle :
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


    }
}
