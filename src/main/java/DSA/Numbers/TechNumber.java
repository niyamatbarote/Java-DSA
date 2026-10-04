package DSA.Numbers;

public class TechNumber {

    public static int countDigits(int n) {
        int count = 0 ;
        while (n!=0) {
            count++;
            n/=10;
        }
        return count;
    }

    public static boolean isTechNumber(int num) {
        int digits = countDigits(num);
        // Base Case :
        if (digits%2 != 0) {
            return false;
        }
        int temp = num;
        int splitPoint = digits/2;
        // Power :
        int product = 1;
        for (int i = 0; i < splitPoint; i++) {
            product *= 10;
        }
        int sumOfSplitNum = num/product + num%product;
        int square = sumOfSplitNum * sumOfSplitNum;
        return square == num;
    }

    public static void main(String[] args) {
        System.out.println(isTechNumber(2025));
        char ch = '[';
        char ch1 = ']';
        System.out.println((int)ch);
        System.out.println((int)ch1);
    }
}
