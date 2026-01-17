package DSA.Math;

public class Power_of_X {

    static double myPow(double x, int n) {
        // Rime Limit Exceeding in this method

        double ans = x;
        if (n == 0) {
            return 1;
        }

        if (n>0 ){
            for (int i = n; i > 1 ; i--) {
                ans = ans*x;
            }
        }else {
            int m = Math.abs(n);
            for (int i = m; i > 1 ; i--) {
                ans = ans*x;
            }
            return 1/ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
}
