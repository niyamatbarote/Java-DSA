package DSA.Numbers;

public class DisariumNumber {

    // Method to Count Digits For pow(n) :
    public static int countDigit(int n) {
        int count = 0;
        for (int i = 0; n>0; i++) {
            n /= 10;
            count++;
        }
        return count;
    }
    // Method to Fetch Last Digit of Num
    public static int lastDigit(int n) {
        int last = 0;
        last = n%10;
        return last;
    }

    public static boolean isDisarium(int n) {
        int og=n;
        int tot = 0;

        while (n>0) {
            // To Fetch Last Digit Number :
            int pow = countDigit(n);
            int last = lastDigit(n);
            int mult = last;
            for (int i = 1; i <pow; i++) {
                mult = mult * last;
            }
            tot += mult;
            n /= 10;
        }
        return og == tot ;
    }

    public static void main(String[] args) {
        System.out.println(isDisarium(135));
    }
}

//    Some Disarium Numbers
//1
//2
//3
//4
//5
//6
//7
//8
//9
//89
//135
//175
//518
//598
//1306
//1676
//2427
// ✅ 135 is a Disarium number.
//
//    Example 2: 89
//
//    Digits: 8, 9
//
//            8
//            1
//            =8
//            9
//            2
//            =81
//
//    Sum = 8 + 81 = 89
//
//            ✅ 89 is a Disarium number.
//
//    Example 3: 123
//
//    Digits: 1, 2, 3
//
//            1
//            1
//            =1
//            2
//            2
//            =4
//            3
//            3
//            =27
//
//    Sum = 1 + 4 + 27 = 32
//
//            ❌ 123 is not a Disarium number.
