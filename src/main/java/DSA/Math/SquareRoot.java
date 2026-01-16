package DSA.Math;

public class SquareRoot {

    // Linear Search
    static int sqrRoot(int x) {
        int ans = -1;

        for (int i = 1; i < x; i++) {
            if (i*i == x) {
                ans = i;
            }
        }
    return ans;
    }

    // Using Binary Search: More Optimal
    // Time Complexity O(log N)
    static double sqrRootBS(int target, int precision) {

        int start = 0;
        int end = target;
        double root = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == target) {
                root = mid;
                return mid;
            }
            if (target < mid * mid) {
                end = mid - 1;
            } else {
                root = mid; // Stores Best Possible Root Value
                start = mid + 1;
            }
        }
            // Condition for IMPERFECT SQRT (Adding precision for SQRT)
            double increment = 0.1;
            for (int i = 1; i <= precision; i++) {
                while (root*root <= target) {
                    root += increment;
                }
                root -= increment;
                increment /= 10;
            }
        return root;
    }

    // NEWTON RAPHSON METHOD :-
    //    Time Complexity: O[log(n) F(n)]
    //    Formula :--
    //    √N = [X + (N/X)]/2
    //        Where X=guess, and N = Root Value
    static double newtonRaphson(int n) {

        double x = n;
        double root ;
        while (true){

            root = 0.5 * (x + n / x );    // 0.5 == x/2

            if (Math.abs(root-x)<0.5) { // Here 0.5 is Precision
                return root;
            }
            x = root;
        }

    }



    public static void main(String[] args) {

//        System.out.println(sqrRoot(4));
//        System.out.printf("%.3f",sqrRootBS(40,3));

        System.out.printf("%.3f", newtonRaphson(40));

    }
}
