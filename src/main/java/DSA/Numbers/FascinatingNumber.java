package DSA.Numbers;

public class FascinatingNumber {

    public static boolean isFascinating(int n) {
        // Concatenation of (n) (2*n) (3*n)
        String str = "" + n + (2*n) + (3*n);
        // Check if Digits are 9
        if (str.length() != 9) {
            return false;
        }
        // If 0 Present Then RET False
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '0') {
                return false;
            }
        }
        // if Repeated Numbers Found RET False
        for (char ch = '1'; ch<='9'; ch++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            // If Count > 1 Then There is REPETITION in Numbers :
            // If Count < 1 OR 0 That Number is Not present in That Concatenated Number
            if (count != 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isFascinating(273));
    }
}
//    Some Fascinating Numbers:
//            192
//            219
//            273
//            327
//            672
//            692
//            726
//            729
//    A Fascinating number is a number that, when multiplied by 2 and 3, and the results are concatenated with the original number, forms a 9-digit number containing each digit from 1 to 9 exactly once (with no 0s).
//
//    Steps to check
//    Take a number n.
//    Find 2 × n and 3 × n.
//            Concatenate: n, 2n, and 3n.
//            Check if the concatenated number:
//    Has exactly 9 digits.
//    Contains each digit 1 to 9 exactly once.
//    Does not contain 0.
//    Example 1: 192
//            192 × 2 = 384
//            192 × 3 = 576
//
//    Concatenate:
//
//            192384576
//
//    Digits are:
//
//            1 2 3 4 5 6 7 8 9
//
//            ✅ 192 is a Fascinating number.
