package DSA.Numbers;

public class HappyNumber {


    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = numSquare(slow);
            fast = numSquare(numSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;

    }

    public static int numSquare(int n) {
        int ans = 0;
        while (n>0) {
            int last = n%10;
            ans += last * last;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        // is Number Happy Using Floyd's Cycle Detection Algorithm
        System.out.println(isHappy(2));
    }
}
