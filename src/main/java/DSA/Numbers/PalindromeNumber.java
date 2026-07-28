package DSA.Numbers;

//    A palindrome number is a number that reads the same forward and backward.
//
//    Examples of palindrome numbers
//    121 → Forward: 121, Backward: 121 ✅
//            1331 → Forward: 1331, Backward: 1331 ✅
//            7 → A single-digit number is always a palindrome. ✅

public class PalindromeNumber {

    // Method to Reverse the Number :
    public static int reverseNumber(int n) {
        int rev= 0;
        for (int i = 0; n>0; i++) {
            // Fetch Last Digit of n
            int lastDig = n%10;
            // Add it to 'rev' by Multiplying by 10 for CONCATENATION
            rev = rev * 10 + lastDig;
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int rev = reverseNumber(n);
        return rev == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(345543));
    }
}
