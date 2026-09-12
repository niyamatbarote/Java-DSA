package DSA.Numbers;

public class ArmStrongNumber {

    public static int countDigits(int n) {
        int count = 0;
        while (n>0) {
            count++;
            n/=10;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        int og = n;
        int power = countDigits(n);
        int maxSum = 0;
        while (n>0) {
            int p = power;
            int digit = n%10;
            int sum = 1;
            // Last Digits Power
            for (int i=p; i>0; i--) {
                sum *= digit ;
            }
            // Adding it With total sum :
            maxSum += sum;
            n/=10;
        }
        return og == maxSum;
    }


    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
    }
}
