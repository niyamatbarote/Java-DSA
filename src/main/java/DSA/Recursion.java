package DSA;

public class Recursion {

    // Binary Search using recursion
    static int binarySearch(int[] arr, int target, int start, int end) {

        // Base Case :-
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Recursive Steps :-
        if (target == arr[mid]) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        }

        return binarySearch(arr, target, start, mid - 1);

    }

    static int fibonacci(int n) {

        // Base Case :-
        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int factorial(int n) {
        // Base Case :-
        if (n == 1) {
            return 1;
        }

        // Recursive Step :-
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int[] arr = { 12, 23, 34, 45, 56, 67, 78, 89, 90 };

        // Following are non-tail recurson as they are waiting for other values to
        // complete the calcultn
        // System.out.println(factorial(4));

        // Here Due to Larger Nth value of fibonacci, the program got stuck in the tree
        // computing the repititive calls, and it stuck bcoz it re-evaluates the same
        // thing again and again
        System.out.println(fibonacci(9));

        // sol of BS:-
        // int target = 12;
        // int ans = binarySearch(arr, target, 0, arr.length - 1);
        // System.out.println(ans);

    }
}
