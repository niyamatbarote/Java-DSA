package DSA.Numbers;

import java.util.ArrayList;

public class PerfectNumber {

    public static boolean checkPerfectNumber(int num) {
        if (num<3) {
            return false;
        }
        int sum = 0;
        int n = num/2;
        for (int i =1; i<=n; i++) {
            if (num%i==0) {
                sum+=i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(7));
    }
}
