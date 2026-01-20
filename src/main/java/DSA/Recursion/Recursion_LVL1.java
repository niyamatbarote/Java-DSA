package DSA.Recursion;

public class Recursion_LVL1 {

    static void nToOne(int n) {

        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        nToOne(n-1);    // eg :- f(5)->f(4)->f(3)->f(2)->f(1)->f(0)
        // In this it is printing "n" when stack is being Filled
    }

    static void oneToN(int n) {
        if (n == 0) {
            return;
        }
        oneToN(n-1);
        System.out.print(n+" ");
        // f(5)->f(4)->f(3)->f(2)->f(1)->f(0) (How Stack Is Filling)
        // return f(0)->f(1)->f(2)->f(3)->f(4)->f(5)    (How Stack is Being Empty)
        // In this it is printing "n" when stack is being empty
    }

    static void bothFxn(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        bothFxn(n-1);
        System.out.print(n+" ");
    }

    static double factorial(int n) {
        // Base Case:
        if (n < 2) {
            return n;
        }
        // Recursion :
        return n * factorial(n-1);
    }

    static int sumOfNdigits(int n) {
        // Base Case:-
        if (n <= 1) {
            return 1;
        }
        // Recursive Part :-
        return n + sumOfNdigits(n-1);
    }

    // 231 == 2 + 3 + 1 == 6
    // Using General Method
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            // Extract last digit of n (eg:- 232 % 10 == 3)
            sum += n%10;
            // Remove last digit of n (e.g:- 232 / 10 == 23)
            n /= 10;
        }
        return sum;
    }

    static int sumOfDigitsRec(int n) {
        // Base Case :
        if (n < 1) {
            return 0;
        }
        // Recursion Formula :-
        return (n%10) + sumOfDigitsRec(n/10);
    }

    public static void main(String[] args) {
//        bothFxn(10);
        System.out.println(sumOfDigits(232));
        System.out.println(sumOfDigitsRec(232));
    }
}
