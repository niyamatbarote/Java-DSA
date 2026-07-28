package DSA.randomLeetCode;

import java.util.Arrays;

public class RandomPractice {

    // Swap Elements :
    public static int[] swap(int[] arr, int start, int end ) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

// Reverse an array :
    public static int[] rev(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }

    // Q) 4 Median of two sorted arrays :
    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int a1 = arr1.length;
        int a2 = arr2.length;
        int i =0;
        int j =0;
        int k =0;

        int[] ans = new int[a1+a2];

        while (i < a1 && j < a2) {

            if ( arr1[i] > arr2[j] ) {
                ans[k] = arr2[j];
                k++;
                j++;
            } else {
                ans[k] = arr1[i];
                k++;
                i++;
            }
        }

        while (i<a1) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j<a2) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        int n = ans.length;
        double median = 0.0;

        if (n%2 != 0) {
            median = ans[(n-1)/2];
        }
        else   {
            median = (double) (ans[n / 2] + ans[n / 2 - 1]) / 2;
        }

        return median;
    }

    public static void starPattern1 (int n) {

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

//    static void starPattern2 (int n) {
//        int var = n-1;
//        for (int i =1 ; i<=n; i++) {
//
//            for (int j = var; j<=n; j--) {
//                System.out.print("   ");
//            }
//
//            for (int k = 1; k<=i; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Target Found ..!!
            if (arr[mid] == target) {
                return mid;
            }
            // Target > Mid
            if (target > arr[mid]) {
                start = mid + 1;
            }
            // Target < Mid
            if (target < arr[mid]) {
                end = mid -1;
            }
        }
        // If Target Not Found
        return -1;
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
// For -ve Numbers
        if (n < 0) {
            n = -n;
        }

        int count = 0;
        while (n > 0) {
            n /= 10;
            count ++;
        }
        return count;
    }

    public static int reverseNum(int n) {

        if (n == 0) {
            return 1;
        }

        int rev = 0;

        while (n>0) {
            int digit = n%10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int og = n;
        int rev = 0;

        while (n>0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return og == rev;
    }

    public static int largestDigit(int n) {
        if (n<10) {
            return n;
        }
        int large = n % 10;

        while (n>0) {
            int dig = n % 10;
            if (dig > large) {
                large = dig;
            }
            n /= 10;
        }
        return large;
    }

    public static void fibo(int n) {
        int a =0;
        int b =1;

        for (int i = 0; i<n; i++) {
            System.out.print( a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }

    public static int fiboNth(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }

public static boolean isFascinating(int n) {
        String str = "" + n + (2*n) + (3*n);

        // Length is not 9 check
        if (str.length() != 9) {
            return false;
        }
    // Contains Zero check
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 0) {
            return false;
        }
    }

    for (char ch = '1'; ch<='9'; ch++) {
        int count  = 0;
        for (int k = 0; k < str.length(); k++) {
            if (ch == str.charAt(k)) {
                count++;
            }
        }
        if (count != 1) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        int[] arrray = {10,20,30,40,50};
        int[] arr = {60};
        int n = arrray.length;
        System.out.println(isFascinating(123456789));


    }
}
