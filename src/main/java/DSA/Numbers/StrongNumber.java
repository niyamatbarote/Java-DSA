package DSA.Numbers;

public class StrongNumber {

    public static boolean isStrongNumber(int n) {
        int sum  =0;
        int og = n;

        while (n>0) {
            int digit = n%10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }
        return sum==og;
    }

    public static void main(String[] args) {
        System.out.println(isStrongNumber(0));
    }
}
