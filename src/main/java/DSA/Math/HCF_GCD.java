package DSA.Math;

public class HCF_GCD {

    static int maxNumInArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minNumInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }

    // LC Q) 1979 Link:
    // https://leetcode.com/problems/find-greatest-common-divisor-of-array/
    public static int findGCD(int[] arr) {
        int a = minNumInArray(arr);
        int b = maxNumInArray(arr);

        return gcd(a,b);

    }

    // Euclidean's Formula:-
    static int gcd(int a , int b ) {

        //Base Case:
        if (a==0) {
            return b;
        }

        return gcd(b%a, a);
    }


    public static void main(String[] args) {
        System.out.println(gcd(2,5));

        int[] arr = {353,403,475,371,174,102,406,445,204,485,400};
        System.out.println(findGCD(arr));


    }
}
